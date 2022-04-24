package code.codeguru.equinix.oms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.Table;

@Entity
@Table(name = "orderqueue")
public class OrderQueue {

    @Id
    @Column(name = "id")
    @MapKey(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "orderReferenceId")
    @MapKey(name = "orderReferenceId")
    private String orderReferenceId;

    @Column(name = "orderNumber")
    @MapKey(name = "orderNumber")
    private String orderNumber;

    @Column(name = "srNumber")
    @MapKey(name = "srNumber")
    private String srNumber;

    @Column(name = "generic_orders_products_queue_id")
    @MapKey(name = "generic_orders_products_queue_id")
    private Integer generic_orders_products_queue_id;

    @Column(name = "state")
    @MapKey(name = "state")
//    @Enumerated(EnumType.STRING)
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderReferenceId() {
        return orderReferenceId;
    }

    public void setOrderReferenceId(String orderReferenceId) {
        this.orderReferenceId = orderReferenceId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSrNumber() {
        return srNumber;
    }

    public void setSrNumber(String srNumber) {
        this.srNumber = srNumber;
    }

    public Integer getGeneric_orders_products_queue_id() {
        return generic_orders_products_queue_id;
    }

    public void setGeneric_orders_products_queue_id(Integer generic_orders_products_queue_id) {
        this.generic_orders_products_queue_id = generic_orders_products_queue_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
