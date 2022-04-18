package my.phonepe.cab.management.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "user")
public class User {

	@Id
	@MapKey(name = "user_id")
	@JsonProperty("user_id")
	public Integer user_id;

	@MapKey(name = "user_type")
	@JsonProperty("user_type")
	public String user_type;

	@JoinColumn(name = "base_location")
	@OneToOne // (mappedBy = "location_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL,
				// targetEntity = Location.class)
	public Location base_location;

	@MapKey(name = "first_name")
	@JsonProperty("first_name")
	public String first_name;

	@MapKey(name = "last_name")
	@JsonProperty("last_name")
	public String last_name;

	@MapKey(name = "mobile_number")
	@JsonProperty("mobile_number")
	public Long mobile_number;

	@MapKey(name = "email_id")
	@JsonProperty("email_id")
	public String email_id;

	@MapKey(name = "age")
	@JsonProperty("age")
	public Integer age;

	@MapKey(name = "gender")
	@JsonProperty("gender")
	public String gender;

	@MapKey(name = "active")
	@JsonProperty("active")
	public String active;

	@MapKey(name = "dob")
	@JsonProperty("dob")
	public Date dob;

}
