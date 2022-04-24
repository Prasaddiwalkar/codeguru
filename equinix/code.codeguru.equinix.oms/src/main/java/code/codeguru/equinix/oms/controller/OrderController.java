package code.codeguru.equinix.oms.controller;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import code.codeguru.equinix.oms.entity.GenericOrdersProducts;
import code.codeguru.equinix.oms.entity.OrderQueue;
import code.codeguru.equinix.oms.enums.OrderSates;
import code.codeguru.equinix.oms.requestmodels.RootOrders;
import code.codeguru.equinix.oms.services.OrderQueueService;
import code.codeguru.equinix.oms.services.OrderService;
import code.codeguru.equinix.oms.utils.OmsUtils;
import code.codeguru.equinix.soap.oms.shellorder.ShellOrderResponseType;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/order")
public class OrderController {

   private static Logger LOG = LoggerFactory.getLogger(OrderController.class);
   private static final String RESILIENCE4J_INSTANCE_NAME = "shellorder";
   private static final String FALLBACK_METHOD = "fallback";

   private static final String RETRY_FALLBACK_METHOD = "retryfallback";

   @Autowired
   OrderService orderService;

   @Autowired
   OrderQueueService queueService;

   @Autowired
   Jaxb2Marshaller marshaller;

   @PostMapping(value = "/place", produces = MediaType.APPLICATION_XML_VALUE)
   @CircuitBreaker(name = RESILIENCE4J_INSTANCE_NAME, fallbackMethod = FALLBACK_METHOD)
   @Retry(name = RESILIENCE4J_INSTANCE_NAME, fallbackMethod = RETRY_FALLBACK_METHOD)
   public Set<String> placeOrder(@RequestBody RootOrders order, HttpServletResponse response)
         throws Exception, JAXBException {

      Set<GenericOrdersProducts> generic = OmsUtils.orderMapper(order.getOrders());

      // insert order request details with dummy order and ref number in mysql

      Set<String> responseStrings = new HashSet<String>();
      generic.forEach(gener -> {
         OrderQueue queue = new OrderQueue();
         try {
            ShellOrderResponseType orderResp = orderService.callSOAPService(gener);

            GenericOrdersProducts orderProduct = orderService.createOrUpdate(gener);

            queue.setState(OrderSates.COMPLETED.name());
            queue.setGeneric_orders_products_queue_id(orderProduct.getId());
            queue.setOrderNumber(orderResp.getOrderNumber());
            queue.setOrderReferenceId(orderResp.getOrderReferenceId());
            queue.setSrNumber(orderResp.getSRNumber());
            queueService.createOrUpdate(queue);

            String xml = OmsUtils.toXML(orderResp);
            responseStrings.add(xml);
            LOG.info(xml);
         } catch (Exception ex) {

            // retry one more time
            try {
               ShellOrderResponseType orderResp = orderService.callSOAPService(gener);
               GenericOrdersProducts orderProduct = orderService.createOrUpdate(gener);

               queue.setState(OrderSates.COMPLETED.name());
               queue.setGeneric_orders_products_queue_id(orderProduct.getId());
               queue.setOrderNumber(orderResp.getOrderNumber());
               queue.setOrderReferenceId(orderResp.getOrderReferenceId());
               queue.setSrNumber(orderResp.getSRNumber());
               queueService.createOrUpdate(queue);
               String xml = OmsUtils.toXML(orderResp);
               responseStrings.add(xml);
            } catch (Exception ex1) {
               // store request in orderqueue
               ShellOrderResponseType orderResp = orderService.callSOAPService(gener);
               GenericOrdersProducts orderProduct = orderService.createOrUpdate(gener);
               if (orderResp != null) {
                  queue.setState(OrderSates.COMPLETED.name());
                  queue.setGeneric_orders_products_queue_id(orderProduct.getId());
                  queue.setOrderNumber(orderResp.getOrderNumber());
                  queue.setOrderReferenceId(orderResp.getOrderReferenceId());
                  queue.setSrNumber(orderResp.getSRNumber());
               } else {
                  queue.setGeneric_orders_products_queue_id(orderProduct.getId());
                  queue.setState(OrderSates.PENDING.name());
               }
               queueService.createOrUpdate(queue);
            }
         }
      });

      orderService.createOrUpdateBulk(generic);

      return responseStrings;
   }

   @GetMapping(value = "getpending", produces = MediaType.APPLICATION_JSON_VALUE)
   public Set<GenericOrdersProducts> getPendingOrders() {
      return queueService.getPendingOrders();
   }

   public Set<String> fallback(Exception ex) {
      LOG.info("Fall back method Started");
      LOG.info(ex.getStackTrace().toString());
      LOG.info("Fall back method executed");
      return null;
   }

   public Set<String> retryfallback(Exception ex) {
      LOG.info("Fall back retry method Started");
      LOG.info(ex.getStackTrace().toString());
      LOG.info("Fall back retry method Started");
      return null;
   }

}
