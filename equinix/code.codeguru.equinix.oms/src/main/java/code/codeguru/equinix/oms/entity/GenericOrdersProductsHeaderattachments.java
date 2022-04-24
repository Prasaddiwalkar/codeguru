package code.codeguru.equinix.oms.entity;

import javax.persistence.*;

@Entity
@Table(name = "generic_orders_products_headerattachments")
public class GenericOrdersProductsHeaderattachments {
    @ManyToOne(targetEntity = GenericOrdersProducts.class)
    @JoinColumn(name = "generic_Orders_Products_id")
    private Integer genericOrdersProductsId;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "value")
    private String value;

    public Integer getGenericOrdersProductsId() {
        return this.genericOrdersProductsId;
    }

    public void setGenericOrdersProductsId(Integer genericOrdersProductsId) {
        this.genericOrdersProductsId = genericOrdersProductsId;
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
