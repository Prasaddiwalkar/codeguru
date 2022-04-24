package code.codeguru.equinix.oms.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.codeguru.equinix.oms.entity.GenericOrdersProducts;
import code.codeguru.equinix.oms.repository.OrderRepository;
import code.codeguru.equinix.oms.soap.client.ShellOrderSOAPClient;
import code.codeguru.equinix.soap.oms.shellorder.ShellOrderResponseType;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepo;
    
    @Autowired
    ShellOrderSOAPClient soapClient;

    public GenericOrdersProducts createOrUpdate(GenericOrdersProducts order) {
        return orderRepo.save(order);
    }

    public void createOrUpdateBulk(Set<GenericOrdersProducts> orders) {
        Set<GenericOrdersProducts> orderProduct = new HashSet<GenericOrdersProducts>();
        orderRepo.saveAll(orders).forEach(orderProduct::add);
    }

    public ShellOrderResponseType callSOAPService(GenericOrdersProducts order) {
        return soapClient.getShellOrder(order);
    }

    Set<GenericOrdersProducts> orderProduct = new HashSet<GenericOrdersProducts>();

    public Set<GenericOrdersProducts> findAllById(List<Integer> ids) {
        orderRepo.findAllById(ids).forEach(orderProduct::add);

        return orderProduct;
    }

}
