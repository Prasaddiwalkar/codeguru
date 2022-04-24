package code.codeguru.equinix.oms.repository;

import org.springframework.data.repository.CrudRepository;

import code.codeguru.equinix.oms.entity.GenericOrdersProducts;

//
public interface OrderRepository extends CrudRepository<GenericOrdersProducts, Integer> {

}
