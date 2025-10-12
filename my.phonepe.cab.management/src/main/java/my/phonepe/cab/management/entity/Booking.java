package my.phonepe.cab.management.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @MapKey(name = "booking_id")
    @JsonProperty("booking_id")
    private Integer booking_id;

    @MapKey(name = "pick_up_location_id")
    @JsonProperty("pick_up_location_id")
    @JoinColumn(name = "pick_up_location_id")
    @OneToOne
    private Location pick_up_location_id;

    @MapKey(name = "dest_location_id")
    @JsonProperty("dest_location_id")
    @JoinColumn(name = "dest_location_id")
    @OneToOne
    private Location dest_location_id;

    @MapKey(name = "user_id")
    @JsonProperty("user_id")
    //	@OneToOne(mappedBy = "user_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL,
    // targetEntity = User.class)
    private Integer user_id;

    @MapKey(name = "driver_id")
    @JsonProperty("driver_id")
    //	@OneToOne(mappedBy = "user_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL,
    // targetEntity = User.class)
    private Integer driver_id;

    @JoinColumn(name = "cab_id")
    //	@OneToMany(mappedBy = "cab_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL,
    // targetEntity = Cab.class)
    @OneToOne
    private Cab cab_id;

    //    @OneToOne(mappedBy = "")
    //    private Trip trip;

    public Cab getCab_id() {
        return cab_id;
    }

    public void setCab_id(Cab cab_id) {
        this.cab_id = cab_id;
    }

    public Location getPick_up_location_id() {
        return pick_up_location_id;
    }

    public void setPick_up_location_id(Location pick_up_location_id) {
        this.pick_up_location_id = pick_up_location_id;
    }

    public Location getDest_location_id() {
        return dest_location_id;
    }

    public void setDest_location_id(Location dest_location_id) {
        this.dest_location_id = dest_location_id;
    }

    public Integer getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Integer booking_id) {
        this.booking_id = booking_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }
}
