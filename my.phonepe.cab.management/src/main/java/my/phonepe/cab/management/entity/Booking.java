package my.phonepe.cab.management.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@MapKey(name = "booking_id")
	@JsonProperty("booking_id")
	private Integer booking_id;

	@MapKey(name = "pick_up_location_id")
	@JsonProperty("pick_up_location_id")
//	@OneToOne(mappedBy = "location_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Location.class)
	private Integer pick_up_location_id;

	@MapKey(name = "dest_location_id")
	@JsonProperty("dest_location_id")
//	@OneToOne(mappedBy = "location_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Location.class)
	private Integer dest_location_id;

	@MapKey(name = "user_id")
	@JsonProperty("user_id")
//	@OneToOne(mappedBy = "user_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = User.class)
	private Integer user_id;

	@MapKey(name = "driver_id")
	@JsonProperty("driver_id")
//	@OneToOne(mappedBy = "user_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = User.class)
	private Integer driver_id;

	@MapKey(name = "cab_id")
	@JsonProperty("cab_id")
//	@OneToMany(mappedBy = "cab_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Cab.class)
	private Integer cab_id;
}
