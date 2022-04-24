package code.codeguru.equinix.oms.services;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.codeguru.equinix.oms.entity.GenericOrdersProducts;
import code.codeguru.equinix.oms.entity.OrderQueue;
import code.codeguru.equinix.oms.enums.OrderSates;
import code.codeguru.equinix.oms.repository.OrderQueueRepository;
import code.codeguru.equinix.oms.repository.OrderRepository;
import code.codeguru.equinix.soap.oms.shellorder.ShellOrderResponseType;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class OrderQueueService {

   private static Logger LOG = LoggerFactory.getLogger(OrderQueueService.class);
   private static final String RESILIENCE4J_INSTANCE_NAME = "pendingOrders";
   private static final String FALLBACK_METHOD = "fallback";

   private static final String RETRY_FALLBACK_METHOD = "retryfallback";

   @Autowired
   OrderQueueRepository orderQueueRepo;

   @Autowired
   OrderService orderService;

   @Autowired
   OrderRepository orderRepo;

   public Set<GenericOrdersProducts> getPendingOrders() {
      List<OrderQueue> list = orderQueueRepo.findByState(OrderSates.PENDING.name());

      List<Integer> ids = list.stream().map(OrderQueue::getGeneric_orders_products_queue_id)
            .collect(Collectors.toList());
      Set<GenericOrdersProducts> pendingShellOrders = orderService.findAllById(ids);

      return pendingShellOrders;
   }

   @CircuitBreaker(name = RESILIENCE4J_INSTANCE_NAME, fallbackMethod = FALLBACK_METHOD)
   @Retry(name = RESILIENCE4J_INSTANCE_NAME, fallbackMethod = RETRY_FALLBACK_METHOD)
   public void processPendingOrderRequests(OrderSates state) {

      // Query all request having status other than open, we can setup state machine
      // to process the all orders
      Set<GenericOrdersProducts> pendingShellOrders = getPendingOrders();

      pendingShellOrders.forEach(gener -> {
         OrderQueue queue = new OrderQueue();
         try {
            ShellOrderResponseType orderResp = orderService.callSOAPService(gener);
            queue.setState(OrderSates.COMPLETED.name());
            createOrUpdate(queue);

         } catch (Exception ex) {

            // retry one more time
            try {
               ShellOrderResponseType orderResp = orderService.callSOAPService(gener);
               queue.setState(OrderSates.COMPLETED.name());
               createOrUpdate(queue);
            } catch (Exception ex1) {
               throw ex1;
            }
         }
      });
   }

   public void fallback(Exception ex) {
      LOG.info("Fall back method Started");
      LOG.info(ex.getStackTrace().toString());
      LOG.info("Fall back method executed");
   }

   public void retryfallback(Exception ex) {
      LOG.info("Fall back retry method Started");
      LOG.info(ex.getStackTrace().toString());
      LOG.info("Fall back retry method Started");
   }

   public OrderQueue createOrUpdate(OrderQueue orderQueue) {
      return orderQueueRepo.save(orderQueue);
   }
}
