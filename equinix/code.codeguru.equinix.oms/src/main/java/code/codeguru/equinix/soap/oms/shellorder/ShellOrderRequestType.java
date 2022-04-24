//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.24 at 09:46:47 AM IST 
//


package code.codeguru.equinix.soap.oms.shellorder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShellOrderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShellOrderRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="accountUCID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactUCID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ibx" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="assetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="metro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="networkTrouble" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="callMeFromCage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShellOrderRequestType", propOrder = {
    "productType",
    "productSubType",
    "accountNumber",
    "accountName",
    "accountUCID",
    "contactUCID",
    "firstName",
    "lastName",
    "workPhone",
    "email",
    "ibx",
    "assetNumber",
    "country",
    "region",
    "metro",
    "severity",
    "productCategory",
    "networkTrouble",
    "callMeFromCage"
})
public class ShellOrderRequestType {

    @XmlElement(required = true)
    protected String productType;
    @XmlElement(required = true)
    protected String productSubType;
    @XmlElement(required = true)
    protected String accountNumber;
    @XmlElement(required = true)
    protected String accountName;
    @XmlElement(required = true)
    protected String accountUCID;
    @XmlElement(required = true)
    protected String contactUCID;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String workPhone;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String ibx;
    @XmlElement(required = true)
    protected String assetNumber;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String region;
    @XmlElement(required = true)
    protected String metro;
    @XmlElement(required = true)
    protected String severity;
    @XmlElement(required = true)
    protected String productCategory;
    @XmlElement(required = true)
    protected String networkTrouble;
    @XmlElement(required = true)
    protected String callMeFromCage;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the productSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSubType() {
        return productSubType;
    }

    /**
     * Sets the value of the productSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSubType(String value) {
        this.productSubType = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountUCID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountUCID() {
        return accountUCID;
    }

    /**
     * Sets the value of the accountUCID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountUCID(String value) {
        this.accountUCID = value;
    }

    /**
     * Gets the value of the contactUCID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactUCID() {
        return contactUCID;
    }

    /**
     * Sets the value of the contactUCID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactUCID(String value) {
        this.contactUCID = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the ibx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbx() {
        return ibx;
    }

    /**
     * Sets the value of the ibx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbx(String value) {
        this.ibx = value;
    }

    /**
     * Gets the value of the assetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetNumber() {
        return assetNumber;
    }

    /**
     * Sets the value of the assetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetNumber(String value) {
        this.assetNumber = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the metro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetro() {
        return metro;
    }

    /**
     * Sets the value of the metro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetro(String value) {
        this.metro = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the networkTrouble property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkTrouble() {
        return networkTrouble;
    }

    /**
     * Sets the value of the networkTrouble property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkTrouble(String value) {
        this.networkTrouble = value;
    }

    /**
     * Gets the value of the callMeFromCage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallMeFromCage() {
        return callMeFromCage;
    }

    /**
     * Sets the value of the callMeFromCage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallMeFromCage(String value) {
        this.callMeFromCage = value;
    }

}