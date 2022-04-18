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

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

}
