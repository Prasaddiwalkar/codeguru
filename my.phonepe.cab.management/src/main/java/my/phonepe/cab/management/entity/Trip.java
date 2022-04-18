package my.phonepe.cab.management.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Trip")
public class Trip {

	@Id
	@MapKey(name = "trip_id")
	@JsonProperty("trip_id")
	private Integer trip_id;

	@MapKey(name = "booking_id")
	@JsonProperty("booking_id")
	private Integer booking_id;

	@MapKey(name = "trip_status")
	@JsonProperty("trip_status")
	private Integer trip_status;

	@MapKey(name = "payment_method")
	@JsonProperty("payment_method")
	private Integer payment_method;
}
