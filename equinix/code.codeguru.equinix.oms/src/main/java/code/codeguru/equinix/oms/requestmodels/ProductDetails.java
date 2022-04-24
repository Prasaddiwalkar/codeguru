
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
@JsonPropertyOrder({ "code", "severity", "incidentDateTime", "callMeFromCage", "networkTrouble", "customerTroubleType",
		"needSupportFromASubmarineCableStationEngineer", "assetNumber", "productCategory" })
@Generated("jsonschema2pojo")
public class ProductDetails {

	@JsonProperty("code")
	private String code;
	@JsonProperty("severity")
	private String severity;
	@JsonProperty("incidentDateTime")
	private String incidentDateTime;
	@JsonProperty("callMeFromCage")
	private boolean callMeFromCage;
	@JsonProperty("networkTrouble")
	private boolean networkTrouble;
	@JsonProperty("customerTroubleType")
	private String customerTroubleType;
	@JsonProperty("needSupportFromASubmarineCableStationEngineer")
	private boolean needSupportFromASubmarineCableStationEngineer;
	@JsonProperty("assetNumber")
	private String assetNumber;
	@JsonProperty("productCategory")
	private String productCategory;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

//	public ProductDetails withCode(String code) {
//		this.code = code;
//		return this;
//	}

	@JsonProperty("severity")
	public String getSeverity() {
		return severity;
	}

	@JsonProperty("severity")
	public void setSeverity(String severity) {
		this.severity = severity;
	}

//	public ProductDetails withSeverity(String severity) {
//		this.severity = severity;
//		return this;
//	}

	@JsonProperty("incidentDateTime")
	public String getIncidentDateTime() {
		return incidentDateTime;
	}

	@JsonProperty("incidentDateTime")
	public void setIncidentDateTime(String incidentDateTime) {
		this.incidentDateTime = incidentDateTime;
	}

//	public ProductDetails withIncidentDateTime(String incidentDateTime) {
//		this.incidentDateTime = incidentDateTime;
//		return this;
//	}

	@JsonProperty("callMeFromCage")
	public boolean isCallMeFromCage() {
		return callMeFromCage;
	}

	@JsonProperty("callMeFromCage")
	public void setCallMeFromCage(boolean callMeFromCage) {
		this.callMeFromCage = callMeFromCage;
	}

//	public ProductDetails withCallMeFromCage(boolean callMeFromCage) {
//		this.callMeFromCage = callMeFromCage;
//		return this;
//	}

	@JsonProperty("networkTrouble")
	public boolean isNetworkTrouble() {
		return networkTrouble;
	}

	@JsonProperty("networkTrouble")
	public void setNetworkTrouble(boolean networkTrouble) {
		this.networkTrouble = networkTrouble;
	}

//	public ProductDetails withNetworkTrouble(boolean networkTrouble) {
//		this.networkTrouble = networkTrouble;
//		return this;
//	}

	@JsonProperty("customerTroubleType")
	public String getCustomerTroubleType() {
		return customerTroubleType;
	}

	@JsonProperty("customerTroubleType")
	public void setCustomerTroubleType(String customerTroubleType) {
		this.customerTroubleType = customerTroubleType;
	}

//	public ProductDetails withCustomerTroubleType(String customerTroubleType) {
//		this.customerTroubleType = customerTroubleType;
//		return this;
//	}

	@JsonProperty("needSupportFromASubmarineCableStationEngineer")
	public boolean isNeedSupportFromASubmarineCableStationEngineer() {
		return needSupportFromASubmarineCableStationEngineer;
	}

	@JsonProperty("needSupportFromASubmarineCableStationEngineer")
	public void setNeedSupportFromASubmarineCableStationEngineer(
			boolean needSupportFromASubmarineCableStationEngineer) {
		this.needSupportFromASubmarineCableStationEngineer = needSupportFromASubmarineCableStationEngineer;
	}

//	public ProductDetails withNeedSupportFromASubmarineCableStationEngineer(
//			boolean needSupportFromASubmarineCableStationEngineer) {
//		this.needSupportFromASubmarineCableStationEngineer = needSupportFromASubmarineCableStationEngineer;
//		return this;
//	}

	@JsonProperty("assetNumber")
	public String getAssetNumber() {
		return assetNumber;
	}

	@JsonProperty("assetNumber")
	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}

//	public ProductDetails withAssetNumber(String assetNumber) {
//		this.assetNumber = assetNumber;
//		return this;
//	}

	@JsonProperty("productCategory")
	public String getProductCategory() {
		return productCategory;
	}

	@JsonProperty("productCategory")
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

//	public ProductDetails withProductCategory(String productCategory) {
//		this.productCategory = productCategory;
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

//	public ProductDetails withAdditionalProperty(String name, Object value) {
//		this.additionalProperties.put(name, value);
//		return this;
//	}

}
