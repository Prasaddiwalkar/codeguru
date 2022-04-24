package code.codeguru.equinix.oms.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "generic_orders_products_ibxlocation")

public class GenericOrdersProductsIbxlocation {
    @ManyToOne(targetEntity = GenericOrdersProducts.class)
    @JoinColumn(name = "generic_Orders_Products_id")
    private Integer genericOrdersProductsId;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ibxTime")
    private String ibxTime;

    @Column(name = "timezone")
    private String timezone;

    @Column(name = "ibx")
    private String ibx;

    @Column(name = "region")
    private String region;

    @Column(name = "address1")
    private String address1;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "accessRestricted", columnDefinition = "TINYINT", length = 1)
    private boolean accessRestricted;

    @Column(name = "specialPrivilege", columnDefinition = "TINYINT", length = 1)
    private boolean specialPrivilege;

    @Column(name = "metro")
    private String metro;

    @OneToMany(mappedBy = "genericOrdersProductsIbxLocationId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsIbxlocationCagedetails.class)
    @JsonProperty("cagedetails")
    public Set<GenericOrdersProductsIbxlocationCagedetails> genericOrdersProductsIbxlocationCagedetails;

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

    public String getIbxTime() {
        return this.ibxTime;
    }

    public void setIbxTime(String ibxTime) {
        this.ibxTime = ibxTime;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getIbx() {
        return this.ibx;
    }

    public void setIbx(String ibx) {
        this.ibx = ibx;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean getAccessRestricted() {
        return this.accessRestricted;
    }

    public void setAccessRestricted(boolean accessRestricted) {
        this.accessRestricted = accessRestricted;
    }

    public boolean getSpecialPrivilege() {
        return this.specialPrivilege;
    }

    public void setSpecialPrivilege(boolean specialPrivilege) {
        this.specialPrivilege = specialPrivilege;
    }

    public String getMetro() {
        return this.metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }
}
