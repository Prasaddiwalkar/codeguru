package my.phonepe.cab.management.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "cab_inventory")
public class Cab {

	@Id
	@MapKey(name = "cab_id")
	@JsonProperty("cab_id")
	private Integer cab_id;

	@MapKey(name = "vehicle_type")
	@JsonProperty("vehicle_type")
	private String vehicle_type;

	@MapKey(name = "date_added")
	@JsonProperty("date_added")
	private Date date_added;

	@MapKey(name = "base_location")
	@JsonProperty("base_location")
	@JoinColumn(name = "base_location")
	@OneToOne
	private Location base_location;

	@MapKey(name = "state")
	@JsonProperty("state")
	private String state;

	@MapKey(name = "rto_registration_number")
	@JsonProperty("rto_registration_number")
	private String rto_registration_number;

	@MapKey(name = "current_location")
	@JsonProperty("current_location")
	@OneToOne
	@JoinColumn(name = "current_location")
	private Location current_location;

	@MapKey(name = "idlefrom")
	@JsonProperty("idlefrom")
	@Value("{'some.key=System.nanoTime()'}")
	private Date idlefrom;

	@MapKey(name = "active")
	@JsonProperty("active")
	public String active;
}
