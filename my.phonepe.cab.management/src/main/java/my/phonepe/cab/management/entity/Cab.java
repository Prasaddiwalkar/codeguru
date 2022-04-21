package my.phonepe.cab.management.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

enum States{
    ON_TRIP,
    IDLE
}

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
    private Date idlefrom;

    public Date getIdlefrom() {
        return idlefrom;
    }

    public void setIdlefrom(Date idlefrom) {
        this.idlefrom = idlefrom;
    }

    @MapKey(name = "active")
    @JsonProperty("active")
    public String active;

    public Integer getCab_id() {
        return cab_id;
    }

    public void setCab_id(Integer cab_id) {
        this.cab_id = cab_id;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public Location getBase_location() {
        return base_location;
    }

    public void setBase_location(Location base_location) {
        this.base_location = base_location;
    }

    public String getState() {
        
        return state;
    }

    public void setState(String state) {
        
        this.state = state;
    }

    public String getRto_registration_number() {
        return rto_registration_number;
    }

    public void setRto_registration_number(String rto_registration_number) {
        this.rto_registration_number = rto_registration_number;
    }

    public Location getCurrent_location() {
        return current_location;
    }

    public void setCurrent_location(Location current_location) {
        this.current_location = current_location;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
