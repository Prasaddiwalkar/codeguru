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
@Table(name = "generic_orders_products_contacts")

public class GenericOrdersProductsContacts {
    @ManyToOne(targetEntity = GenericOrdersProducts.class)
    @JoinColumn(name = "generic_Orders_Products_id")
    private Integer genericOrdersProductsId;

    @Id
    @Column(name = "id")
    private Integer id;

    @OneToMany(mappedBy = "genericOrdersProductsContactsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsContactsModifiedcontacts.class)
    @JsonProperty("modifiedContacts")
    public Set<GenericOrdersProductsContactsModifiedcontacts> genericOrdersProductsContactsModifiedcontacts;

    @OneToMany(mappedBy = "genericOrdersProductsContactsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsContactsNotificationcontacts.class)
    @JsonProperty("notificationcontacts")
    public Set<GenericOrdersProductsContactsNotificationcontacts> genericOrdersProductsContactsNotificationcontacts;

    @OneToMany(mappedBy = "genericOrdersProductsContactsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsContactsOrderingcontacts.class)
    @JsonProperty("orderingcontacts")
    public Set<GenericOrdersProductsContactsOrderingcontacts> genericOrdersProductsContactsOrderingcontacts;

    @OneToMany(mappedBy = "genericOrdersProductsContactsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsContactsResellerorderingcontacts.class)
    @JsonProperty("resellerOrderingContacts")
    public Set<GenericOrdersProductsContactsResellerorderingcontacts> genericOrdersProductsContactsResellerorderingcontacts;

    @OneToMany(mappedBy = "genericOrdersProductsContactsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsContactsTechnicalcontacts.class)
    @JsonProperty("technicalcontacts")
    public Set<GenericOrdersProductsContactsTechnicalcontacts> genericOrdersProductsContactsTechnicalcontacts;

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
}
