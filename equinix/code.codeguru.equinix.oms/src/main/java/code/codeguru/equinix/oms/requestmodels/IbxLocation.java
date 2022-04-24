
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
@JsonPropertyOrder({ "ibxTime", "timezone", "ibx", "region", "address1", "city", "state", "country", "accessRestricted",
		"specialPrivilege", "metro", "cageDetails" })
@Generated("jsonschema2pojo")
public class IbxLocation {

	@JsonProperty("ibxTime")
	private String ibxTime;
	@JsonProperty("timezone")
	private String timezone;
	@JsonProperty("ibx")
	private String ibx;
	@JsonProperty("region")
	private String region;
	@JsonProperty("address1")
	private String address1;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("country")
	private String country;
	@JsonProperty("accessRestricted")
	private boolean accessRestricted;
	@JsonProperty("specialPrivilege")
	private boolean specialPrivilege;
	@JsonProperty("metro")
	private String metro;
	@JsonProperty("cageDetails")
	private List<Object> cageDetails = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ibxTime")
	public String getIbxTime() {
		return ibxTime;
	}

	@JsonProperty("ibxTime")
	public void setIbxTime(String ibxTime) {
		this.ibxTime = ibxTime;
	}

//	public IbxLocation withIbxTime(String ibxTime) {
//		this.ibxTime = ibxTime;
//		return this;
//	}

	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}

	@JsonProperty("timezone")
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

//	public IbxLocation withTimezone(String timezone) {
//		this.timezone = timezone;
//		return this;
//	}

	@JsonProperty("ibx")
	public String getIbx() {
		return ibx;
	}

	@JsonProperty("ibx")
	public void setIbx(String ibx) {
		this.ibx = ibx;
	}

//	public IbxLocation withIbx(String ibx) {
//		this.ibx = ibx;
//		return this;
//	}

	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(String region) {
		this.region = region;
	}

//	public IbxLocation withRegion(String region) {
//		this.region = region;
//		return this;
//	}

	@JsonProperty("address1")
	public String getAddress1() {
		return address1;
	}

	@JsonProperty("address1")
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

//	public IbxLocation withAddress1(String address1) {
//		this.address1 = address1;
//		return this;
//	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

//	public IbxLocation withCity(String city) {
//		this.city = city;
//		return this;
//	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

//	public IbxLocation withState(String state) {
//		this.state = state;
//		return this;
//	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

//	public IbxLocation withCountry(String country) {
//		this.country = country;
//		return this;
//	}

	@JsonProperty("accessRestricted")
	public boolean isAccessRestricted() {
		return accessRestricted;
	}

	@JsonProperty("accessRestricted")
	public void setAccessRestricted(boolean accessRestricted) {
		this.accessRestricted = accessRestricted;
	}

//	public IbxLocation withAccessRestricted(boolean accessRestricted) {
//		this.accessRestricted = accessRestricted;
//		return this;
//	}

	@JsonProperty("specialPrivilege")
	public boolean isSpecialPrivilege() {
		return specialPrivilege;
	}

	@JsonProperty("specialPrivilege")
	public void setSpecialPrivilege(boolean specialPrivilege) {
		this.specialPrivilege = specialPrivilege;
	}

//	public IbxLocation withSpecialPrivilege(boolean specialPrivilege) {
//		this.specialPrivilege = specialPrivilege;
//		return this;
//	}

	@JsonProperty("metro")
	public String getMetro() {
		return metro;
	}

	@JsonProperty("metro")
	public void setMetro(String metro) {
		this.metro = metro;
	}

//	public IbxLocation withMetro(String metro) {
//		this.metro = metro;
//		return this;
//	}

	@JsonProperty("cageDetails")
	public List<Object> getCageDetails() {
		return cageDetails;
	}

	@JsonProperty("cageDetails")
	public void setCageDetails(List<Object> cageDetails) {
		this.cageDetails = cageDetails;
	}

//	public IbxLocation withCageDetails(List<Object> cageDetails) {
//		this.cageDetails = cageDetails;
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

//	public IbxLocation withAdditionalProperty(String name, Object value) {
//		this.additionalProperties.put(name, value);
//		return this;
//	}

}
