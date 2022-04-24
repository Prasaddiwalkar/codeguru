package code.codeguru.equinix.oms.entity;

import javax.persistence.*;

@Entity
@Table(name = "generic_orders_products_contacts_technicalcontacts")
public class GenericOrdersProductsContactsTechnicalcontacts {
    @ManyToOne(targetEntity = GenericOrdersProductsContacts.class)
    @JoinColumn(name = "generic_Orders_Products_contacts_id")
    private Integer genericOrdersProductsContactsId;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "workPhone")
    private String workPhone;

    @Column(name = "workPhonePrefToCall")
    private String workPhonePrefToCall;

    @Column(name = "mobilePhone")
    private String mobilePhone;

    @Column(name = "mobilePhonePrefToCall")
    private String mobilePhonePrefToCall;

    @Column(name = "mobilePhoneTimeZone")
    private String mobilePhoneTimeZone;

    @Column(name = "name")
    private String name;

    @Column(name = "userName")
    private String userName;

    @Column(name = "contactUCID")
    private String contactUcid;

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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorkPhone() {
        return this.workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getWorkPhonePrefToCall() {
        return this.workPhonePrefToCall;
    }

    public void setWorkPhonePrefToCall(String workPhonePrefToCall) {
        this.workPhonePrefToCall = workPhonePrefToCall;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhonePrefToCall() {
        return this.mobilePhonePrefToCall;
    }

    public void setMobilePhonePrefToCall(String mobilePhonePrefToCall) {
        this.mobilePhonePrefToCall = mobilePhonePrefToCall;
    }

    public String getMobilePhoneTimeZone() {
        return this.mobilePhoneTimeZone;
    }

    public void setMobilePhoneTimeZone(String mobilePhoneTimeZone) {
        this.mobilePhoneTimeZone = mobilePhoneTimeZone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactUcid() {
        return this.contactUcid;
    }

    public void setContactUcid(String contactUcid) {
        this.contactUcid = contactUcid;
    }
}
