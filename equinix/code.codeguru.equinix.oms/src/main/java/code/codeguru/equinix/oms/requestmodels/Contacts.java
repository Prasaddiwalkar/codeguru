
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "modifiedContacts", "resellerOrderingContacts", "orderingContacts", "technicalContacts",
		"notificationContacts" })
@Generated("jsonschema2pojo")
public class Contacts {

	@JsonProperty("modifiedContacts")
	private List<Object> modifiedContacts = null;
	@JsonProperty("resellerOrderingContacts")
	private List<Object> resellerOrderingContacts = null;
	@JsonProperty("orderingContacts")
	private List<OrderingContact> orderingContacts = null;
	@JsonProperty("technicalContacts")
	private List<TechnicalContact> technicalContacts = null;
	@JsonProperty("notificationContacts")
	private List<NotificationContact> notificationContacts = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("modifiedContacts")
	public List<Object> getModifiedContacts() {
		return modifiedContacts;
	}

	@JsonProperty("modifiedContacts")
	public void setModifiedContacts(List<Object> modifiedContacts) {
		this.modifiedContacts = modifiedContacts;
	}

	public Contacts withModifiedContacts(List<Object> modifiedContacts) {
		this.modifiedContacts = modifiedContacts;
		return this;
	}

	@JsonProperty("resellerOrderingContacts")
	public List<Object> getResellerOrderingContacts() {
		return resellerOrderingContacts;
	}

	@JsonProperty("resellerOrderingContacts")
	public void setResellerOrderingContacts(List<Object> resellerOrderingContacts) {
		this.resellerOrderingContacts = resellerOrderingContacts;
	}

	public Contacts withResellerOrderingContacts(List<Object> resellerOrderingContacts) {
		this.resellerOrderingContacts = resellerOrderingContacts;
		return this;
	}

	@JsonProperty("orderingContacts")
	public List<OrderingContact> getOrderingContacts() {
		return orderingContacts;
	}

	@JsonProperty("orderingContacts")
	public void setOrderingContacts(List<OrderingContact> orderingContacts) {
		this.orderingContacts = orderingContacts;
	}

//	public Contacts withOrderingContacts(List<OrderingContact> orderingContacts) {
//		this.orderingContacts = orderingContacts;
//		return this;
//	}

	@JsonProperty("technicalContacts")
	public List<TechnicalContact> getTechnicalContacts() {
		return technicalContacts;
	}

	@JsonProperty("technicalContacts")
	public void setTechnicalContacts(List<TechnicalContact> technicalContacts) {
		this.technicalContacts = technicalContacts;
	}

//	public Contacts withTechnicalContacts(List<TechnicalContact> technicalContacts) {
//		this.technicalContacts = technicalContacts;
//		return this;
//	}

	@JsonProperty("notificationContacts")
	public List<NotificationContact> getNotificationContacts() {
		return notificationContacts;
	}

	@JsonProperty("notificationContacts")
	public void setNotificationContacts(List<NotificationContact> notificationContacts) {
		this.notificationContacts = notificationContacts;
	}

//	public Contacts withNotificationContacts(List<NotificationContact> notificationContacts) {
//		this.notificationContacts = notificationContacts;
//		return this;
//	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

//	public Contacts withAdditionalProperty(String name, Object value) {
//		this.additionalProperties.put(name, value);
//		return this;
//	}

}
