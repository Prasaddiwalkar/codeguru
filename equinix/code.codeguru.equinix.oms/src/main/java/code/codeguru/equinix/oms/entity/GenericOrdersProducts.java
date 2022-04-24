package code.codeguru.equinix.oms.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "generic_orders_products")
public class GenericOrdersProducts {
//    @ApiModelProperty(hidden = true)
//    @Column(name = "OrderReferenceId")
//    private String orderReferenceId;
//
//    @ApiModelProperty(hidden = true)
//    @Column(name = "OrderNumber")
//    private String orderNumber;
//
//    @ApiModelProperty(hidden = true)
//    @Column(name = "SRNumber")
//    private String srNumber;

	@Column(name = "generic_Orders_id")
	private String genericOrdersId;

	@Id
	@Column(name = "id")
	@MapKey(name = "id")
	@JsonProperty("id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "productType")
	@MapKey(name = "productType")
	private String productType;

	@Column(name = "productSubType")
	@MapKey(name = "productSubType")
	private String productSubType;

	@Column(name = "accountName")
	@JsonProperty("accountName")
	@MapKey(name = "accountName")
	private String accountName;

	@Column(name = "accountUCID")
	@MapKey(name = "accountUCID")
	private String accountUCID;

	@Column(name = "accountNumber")
	@MapKey(name = "accountNumber")
	private String accountNumber;

	@Column(name = "quantityRequested")
	@MapKey(name = "quantityRequested")
	private Integer quantityRequested;

	@Column(name = "customerFollowUpRequired", columnDefinition = "TINYINT", length = 1)
	@MapKey(name = "customerFollowUpRequired")
	private boolean customerFollowUpRequired;

	@Column(name = "ibxTime")
	private String ibxTime;

	@Column(name = "contactUCID")
	private String contactUcid;

	@Column(name = "userName")
	private String userName;

	@Column(name = "userKey")
	private String userKey;

	@OneToMany(mappedBy = "genericOrdersProductsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsAttachments.class)
	@JsonProperty("attachments")
	public Set<GenericOrdersProductsAttachments> genericOrdersProductsAttachments;

	@JsonProperty("contacts")
	@OneToMany(mappedBy = "genericOrdersProductsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsContacts.class)
	public Set<GenericOrdersProductsContacts> genericOrdersProductsContacts;

	@OneToMany(mappedBy = "genericOrdersProductsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsHeaderattachments.class)
	@JsonProperty("headerattachments")
	public Set<GenericOrdersProductsHeaderattachments> genericOrdersProductsHeaderattachments;

	@OneToMany(mappedBy = "genericOrdersProductsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsIbxlocation.class)
	@JsonProperty("ibxlocation")
	public Set<GenericOrdersProductsIbxlocation> genericOrdersProductsIbxlocation;

	@OneToMany(mappedBy = "genericOrdersProductsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsNotes.class)
	@JsonProperty("notes")
	public Set<GenericOrdersProductsNotes> genericOrdersProductsNotes;

	@OneToMany(mappedBy = "genericOrdersProductsId", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = GenericOrdersProductsProductdetails.class)
	@JsonProperty("productDetails")
	public Set<GenericOrdersProductsProductdetails> genericOrdersProductsProductdetails;

//    public String getOrderReferenceId() {
//        return this.orderReferenceId;
//    }
//
//    public void setOrderReferenceId(String orderReferenceId) {
//        this.orderReferenceId = orderReferenceId;
//    }
//
//    public String getOrderNumber() {
//        return this.orderNumber;
//    }
//
//    public void setOrderNumber(String orderNumber) {
//        this.orderNumber = orderNumber;
//    }
//
//    public String getSrNumber() {
//        return this.srNumber;
//    }
//
//    public void setSrNumber(String srNumber) {
//        this.srNumber = srNumber;
//    }

	public String getGenericOrdersId() {
		return this.genericOrdersId;
	}

	public void setGenericOrdersId(String genericOrdersId) {
		this.genericOrdersId = genericOrdersId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductSubType() {
		return this.productSubType;
	}

	public void setProductSubType(String productSubType) {
		this.productSubType = productSubType;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountUCID() {
		return this.accountUCID;
	}

	public void setAccountUCID(String accountUCID) {
		this.accountUCID = accountUCID;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getQuantityRequested() {
		return this.quantityRequested;
	}

	public void setQuantityRequested(Integer quantityRequested) {
		this.quantityRequested = quantityRequested;
	}

	public boolean getCustomerFollowUpRequired() {
		return this.customerFollowUpRequired;
	}

	public void setCustomerFollowUpRequired(boolean customerFollowUpRequired) {
		this.customerFollowUpRequired = customerFollowUpRequired;
	}

	public String getIbxTime() {
		return this.ibxTime;
	}

	public void setIbxTime(String ibxTime) {
		this.ibxTime = ibxTime;
	}

	public String getContactUcid() {
		return this.contactUcid;
	}

	public void setContactUcid(String contactUcid) {
		this.contactUcid = contactUcid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserKey() {
		return this.userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public Set<GenericOrdersProductsAttachments> getGenericOrdersProductsAttachments() {
		return genericOrdersProductsAttachments;
	}

	public void setGenericOrdersProductsAttachments(
			Set<GenericOrdersProductsAttachments> genericOrdersProductsAttachments) {
		this.genericOrdersProductsAttachments = genericOrdersProductsAttachments;
	}

	public Set<GenericOrdersProductsContacts> getGenericOrdersProductsContacts() {
		return genericOrdersProductsContacts;
	}

	public void setGenericOrdersProductsContacts(Set<GenericOrdersProductsContacts> genericOrdersProductsContacts) {
		this.genericOrdersProductsContacts = genericOrdersProductsContacts;
	}

	public Set<GenericOrdersProductsHeaderattachments> getGenericOrdersProductsHeaderattachments() {
		return genericOrdersProductsHeaderattachments;
	}

	public void setGenericOrdersProductsHeaderattachments(
			Set<GenericOrdersProductsHeaderattachments> genericOrdersProductsHeaderattachments) {
		this.genericOrdersProductsHeaderattachments = genericOrdersProductsHeaderattachments;
	}

	public Set<GenericOrdersProductsIbxlocation> getGenericOrdersProductsIbxlocation() {
		return genericOrdersProductsIbxlocation;
	}

	public void setGenericOrdersProductsIbxlocation(
			Set<GenericOrdersProductsIbxlocation> genericOrdersProductsIbxlocation) {
		this.genericOrdersProductsIbxlocation = genericOrdersProductsIbxlocation;
	}

	public Set<GenericOrdersProductsNotes> getGenericOrdersProductsNotes() {
		return genericOrdersProductsNotes;
	}

	public void setGenericOrdersProductsNotes(Set<GenericOrdersProductsNotes> genericOrdersProductsNotes) {
		this.genericOrdersProductsNotes = genericOrdersProductsNotes;
	}

	public Set<GenericOrdersProductsProductdetails> getGenericOrdersProductsProductdetails() {
		return genericOrdersProductsProductdetails;
	}

	public void setGenericOrdersProductsProductdetails(
			Set<GenericOrdersProductsProductdetails> genericOrdersProductsProductdetails) {
		this.genericOrdersProductsProductdetails = genericOrdersProductsProductdetails;
	}
}
