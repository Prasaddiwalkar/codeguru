package my.phonepe.cab.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "location")
public class Location {

	@Id
	@MapKey(name = "location_id")
	@JsonProperty("location_id")
	public Integer location_id;

	@MapKey(name = "city")
	@JsonProperty("city")
	public String city;

	@MapKey(name = "state")
	@JsonProperty("state")
	public String state;

	@MapKey(name = "lat")
	@JsonProperty("lat")
	public String lat;

	@MapKey(name = "longi")
	@JsonProperty("longi")
	public String longi;

	@MapKey(name = "country")
	@JsonProperty("country")
	public String country;

	@MapKey(name = "active")
	@JsonProperty("active")
	public String active;

	

}
