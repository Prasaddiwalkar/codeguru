
package code.codeguru.equinix.oms.requestmodels;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "email", "firstName", "lastName", "workPhone", "workPhonePrefToCall", "mobilePhone",
		"mobilePhonePrefToCall", "mobilePhoneTimeZone", "name", "userName", "contactUCID" })
@Generated("jsonschema2pojo")
public class TechnicalContact {

	@JsonProperty("email")
	private String email;
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("workPhone")
	private String workPhone;
	@JsonProperty("workPhonePrefToCall")
	private String workPhonePrefToCall;
	@JsonProperty("mobilePhone")
	private String mobilePhone;
	@JsonProperty("mobilePhonePrefToCall")
	private String mobilePhonePrefToCall;
	@JsonProperty("mobilePhoneTimeZone")
	private String mobilePhoneTimeZone;
	@JsonProperty("name")
	private String name;
	@JsonProperty("userName")
	private String userName;
	@JsonProperty("contactUCID")
	private String contactUCID;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

//	public TechnicalContact withEmail(String email) {
//		this.email = email;
//		return this;
//	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

//	public TechnicalContact withFirstName(String firstName) {
//		this.firstName = firstName;
//		return this;
//	}

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	public TechnicalContact withLastName(String lastName) {
//		this.lastName = lastName;
//		return this;
//	}

	@JsonProperty("workPhone")
	public String getWorkPhone() {
		return workPhone;
	}

	@JsonProperty("workPhone")
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

//	public TechnicalContact withWorkPhone(String workPhone) {
//		this.workPhone = workPhone;
//		return this;
//	}

	@JsonProperty("workPhonePrefToCall")
	public String getWorkPhonePrefToCall() {
		return workPhonePrefToCall;
	}

	@JsonProperty("workPhonePrefToCall")
	public void setWorkPhonePrefToCall(String workPhonePrefToCall) {
		this.workPhonePrefToCall = workPhonePrefToCall;
	}

//	public TechnicalContact withWorkPhonePrefToCall(String workPhonePrefToCall) {
//		this.workPhonePrefToCall = workPhonePrefToCall;
//		return this;
//	}

	@JsonProperty("mobilePhone")
	public String getMobilePhone() {
		return mobilePhone;
	}

	@JsonProperty("mobilePhone")
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

//	public TechnicalContact withMobilePhone(String mobilePhone) {
//		this.mobilePhone = mobilePhone;
//		return this;
//	}

	@JsonProperty("mobilePhonePrefToCall")
	public String getMobilePhonePrefToCall() {
		return mobilePhonePrefToCall;
	}

	@JsonProperty("mobilePhonePrefToCall")
	public void setMobilePhonePrefToCall(String mobilePhonePrefToCall) {
		this.mobilePhonePrefToCall = mobilePhonePrefToCall;
	}

//	public TechnicalContact withMobilePhonePrefToCall(String mobilePhonePrefToCall) {
//		this.mobilePhonePrefToCall = mobilePhonePrefToCall;
//		return this;
//	}

	@JsonProperty("mobilePhoneTimeZone")
	public String getMobilePhoneTimeZone() {
		return mobilePhoneTimeZone;
	}

	@JsonProperty("mobilePhoneTimeZone")
	public void setMobilePhoneTimeZone(String mobilePhoneTimeZone) {
		this.mobilePhoneTimeZone = mobilePhoneTimeZone;
	}

//	public TechnicalContact withMobilePhoneTimeZone(String mobilePhoneTimeZone) {
//		this.mobilePhoneTimeZone = mobilePhoneTimeZone;
//		return this;
//	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

//	public TechnicalContact withName(String name) {
//		this.name = name;
//		return this;
//	}

	@JsonProperty("userName")
	public String getUserName() {
		return userName;
	}

	@JsonProperty("userName")
	public void setUserName(String userName) {
		this.userName = userName;
	}

//	public TechnicalContact withUserName(String userName) {
//		this.userName = userName;
//		return this;
//	}

	@JsonProperty("contactUCID")
	public String getContactUCID() {
		return contactUCID;
	}

	@JsonProperty("contactUCID")
	public void setContactUCID(String contactUCID) {
		this.contactUCID = contactUCID;
	}

//	public TechnicalContact withContactUCID(String contactUCID) {
//		this.contactUCID = contactUCID;
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

//	public TechnicalContact withAdditionalProperty(String name, Object value) {
//		this.additionalProperties.put(name, value);
//		return this;
//	}

}