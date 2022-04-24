package code.codeguru.equinix.oms.entity;

import javax.persistence.*;

@Entity
@Table(name = "generic_orders_products_contacts_modifiedcontacts")
public class GenericOrdersProductsContactsModifiedcontacts {
    @ManyToOne(targetEntity = GenericOrdersProductsContacts.class)
    @JoinColumn(name = "generic_Orders_Products_contacts_id")
    private Integer genericOrdersProductsContactsId;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "value")
    private String value;

    public Integer getGenericOrdersProductsContactsId() {
        return this.genericOrdersProductsContactsId;
    }

    public void setGenericOrdersProductsContactsId(Integer genericOrdersProductsContactsId) {
        this.genericOrdersProductsContactsId = genericOrdersProductsContactsId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
