package code.codeguru.equinix.oms.entity;

import javax.persistence.*;

@Entity
@Table(name = "generic_orders_products_ibxlocation_cagedetails")
public class GenericOrdersProductsIbxlocationCagedetails {
    @ManyToOne(targetEntity = GenericOrdersProductsIbxlocation.class)
    @JoinColumn(name = "generic_Orders_Products_ibxLocation_id")
    private Integer genericOrdersProductsIbxLocationId;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "value")
    private String value;

    public Integer getGenericOrdersProductsIbxLocationId() {
        return this.genericOrdersProductsIbxLocationId;
    }

    public void setGenericOrdersProductsIbxLocationId(Integer genericOrdersProductsIbxLocationId) {
        this.genericOrdersProductsIbxLocationId = genericOrdersProductsIbxLocationId;
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
