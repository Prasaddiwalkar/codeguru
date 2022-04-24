package code.codeguru.equinix.oms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import code.codeguru.equinix.oms.enums.OrderSates;
import code.codeguru.equinix.oms.services.OrderQueueService;
import code.codeguru.equinix.oms.services.OrderService;

@Component
public class PendingOrderScheduler {

    @Autowired
    OrderService orderService;

    @Autowired
    OrderQueueService orderQueueService;

    @Scheduled(cron = "0 0/1 * * * *")
    public void processPendingOrderRequests() {

        orderQueueService.processPendingOrderRequests(OrderSates.OPEN);
        //
    }
}
