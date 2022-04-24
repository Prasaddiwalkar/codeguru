
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
@JsonPropertyOrder({ "Orders" })
@Generated("jsonschema2pojo")
public class Example {

	@JsonProperty("Orders")
	private Orders orders;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Orders")
	public Orders getOrders() {
		return orders;
	}

	@JsonProperty("Orders")
	public void setOrders(Orders orders) {
		this.orders = orders;
	}

//	public Example withOrders(Orders orders) {
//		this.orders = orders;
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

//	public Example withAdditionalProperty(String name, Object value) {
//		this.additionalProperties.put(name, value);
//		return this;
//	}

}
