package code.codeguru.equinix.oms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import code.codeguru.equinix.oms.entity.OrderQueue;

public interface OrderQueueRepository extends CrudRepository<OrderQueue, Integer> {

    public List<OrderQueue> findByState(String state);
}
