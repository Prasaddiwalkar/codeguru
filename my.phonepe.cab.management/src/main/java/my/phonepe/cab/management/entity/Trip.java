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
@Table(name = "Trip")
public class Trip {

    @Id
    @MapKey(name = "trip_id")
    @JsonProperty("trip_id")
    private Integer trip_id;

    @MapKey(name = "booking_id")
    @JsonProperty("booking_id")
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking_id;

    @MapKey(name = "trip_status")
    @JsonProperty("trip_status")
    private String trip_status;

    @MapKey(name = "payment_method")
    @JsonProperty("payment_method")
    private Integer payment_method;

    @MapKey(name = "start_time")
    @JsonProperty("start_time")
    private Date start_time;

    @MapKey(name = "end_time")
    @JsonProperty("end_time")
    private Date end_time;

    public Integer getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(Integer trip_id) {
        this.trip_id = trip_id;
    }

    public Booking getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(Booking booking_id) {
        this.booking_id = booking_id;
    }

    public String getTrip_status() {
        return trip_status;
    }

    public void setTrip_status(String trip_status) {
        this.trip_status = trip_status;
    }

    public Integer getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(Integer payment_method) {
        this.payment_method = payment_method;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }
}
