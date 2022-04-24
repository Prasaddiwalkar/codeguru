
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
@JsonPropertyOrder({ "noteDescription", "noteType" })
@Generated("jsonschema2pojo")
public class Note {

	@JsonProperty("noteDescription")
	private String noteDescription;
	@JsonProperty("noteType")
	private String noteType;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("noteDescription")
	public String getNoteDescription() {
		return noteDescription;
	}

	@JsonProperty("noteDescription")
	public void setNoteDescription(String noteDescription) {
		this.noteDescription = noteDescription;
	}

//	public Note withNoteDescription(String noteDescription) {
//		this.noteDescription = noteDescription;
//		return this;
//	}

	@JsonProperty("noteType")
	public String getNoteType() {
		return noteType;
	}

	@JsonProperty("noteType")
	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}

//	public Note withNoteType(String noteType) {
//		this.noteType = noteType;
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

//	public Note withAdditionalProperty(String name, Object value) {
//		this.additionalProperties.put(name, value);
//		return this;
//	}

}
