
package code.codeguru.equinix.oms.requestmodels;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "productType", "productSubType", "accountName", "accountUCID", "accountNumber",
        "quantityRequested", "customerFollowUpRequired", "contacts", "attachments", "headerAttachments",
        "productDetails", "ibxTime", "ibxLocation", "contactUCID", "userName", "userKey", "notes" })
@Generated("jsonschema2pojo")
public class Product {

    @JsonProperty("productType")
    private String productType;
    @JsonProperty("productSubType")
    private String productSubType;
    @JsonProperty("accountName")
    private String accountName;
    @JsonProperty("accountUCID")
    private String accountUCID;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("quantityRequested")
    private int quantityRequested;
    @JsonProperty("customerFollowUpRequired")
    private boolean customerFollowUpRequired;
    @JsonProperty("contacts")
    private Contacts contacts;
    @JsonProperty("attachments")
    private List<Attachment> attachments = null;
    @JsonProperty("headerAttachments")
    private List<Object> headerAttachments = null;
    @JsonProperty("productDetails")
    private ProductDetails productDetails;
    @JsonProperty("ibxTime")
    private String ibxTime;
    @JsonProperty("ibxLocation")
    private IbxLocation ibxLocation;
    @JsonProperty("contactUCID")
    private String contactUCID;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("userKey")
    private String userKey;
    @JsonProperty("notes")
    private List<Note> notes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("productType")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("productType")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @JsonProperty("productSubType")
    public String getProductSubType() {
        return productSubType;
    }

    @JsonProperty("productSubType")
    public void setProductSubType(String productSubType) {
        this.productSubType = productSubType;
    }

    @JsonProperty("accountName")
    public String getAccountName() {
        return accountName;
    }

    @JsonProperty("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    @JsonProperty("accountUCID")
    public String getAccountUCID() {
        return accountUCID;
    }

    @JsonProperty("accountUCID")
    public void setAccountUCID(String accountUCID) {
        this.accountUCID = accountUCID;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("quantityRequested")
    public int getQuantityRequested() {
        return quantityRequested;
    }

    @JsonProperty("quantityRequested")
    public void setQuantityRequested(int quantityRequested) {
        this.quantityRequested = quantityRequested;
    }

    @JsonProperty("customerFollowUpRequired")
    public boolean isCustomerFollowUpRequired() {
        return customerFollowUpRequired;
    }

    @JsonProperty("customerFollowUpRequired")
    public void setCustomerFollowUpRequired(boolean customerFollowUpRequired) {
        this.customerFollowUpRequired = customerFollowUpRequired;
    }


    @JsonProperty("contacts")
    public Contacts getContacts() {
        return contacts;
    }

    @JsonProperty("contacts")
    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }


    @JsonProperty("attachments")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("headerAttachments")
    public List<Object> getHeaderAttachments() {
        return headerAttachments;
    }

    @JsonProperty("headerAttachments")
    public void setHeaderAttachments(List<Object> headerAttachments) {
        this.headerAttachments = headerAttachments;
    }


    @JsonProperty("productDetails")
    public ProductDetails getProductDetails() {
        return productDetails;
    }

    @JsonProperty("productDetails")
    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }


    @JsonProperty("ibxTime")
    public String getIbxTime() {
        return ibxTime;
    }

    @JsonProperty("ibxTime")
    public void setIbxTime(String ibxTime) {
        this.ibxTime = ibxTime;
    }


    @JsonProperty("ibxLocation")
    public IbxLocation getIbxLocation() {
        return ibxLocation;
    }

    @JsonProperty("ibxLocation")
    public void setIbxLocation(IbxLocation ibxLocation) {
        this.ibxLocation = ibxLocation;
    }


    @JsonProperty("contactUCID")
    public String getContactUCID() {
        return contactUCID;
    }

    @JsonProperty("contactUCID")
    public void setContactUCID(String contactUCID) {
        this.contactUCID = contactUCID;
    }


    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @JsonProperty("userKey")
    public String getUserKey() {
        return userKey;
    }

    @JsonProperty("userKey")
    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }


    @JsonProperty("notes")
    public List<Note> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
