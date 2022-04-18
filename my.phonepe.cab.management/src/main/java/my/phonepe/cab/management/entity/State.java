package my.phonepe.cab.management.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "state")
public class State {

    @Id
    @MapKey(name = "state_id")
    @JsonProperty("state_id")
    private Integer state_id;

    @MapKey(name = "cab_id")
    @JsonProperty("cab_id")
    private Integer cab_id;

    @MapKey(name = "state")
    @JsonProperty("state")
    private String state;

    @MapKey(name = "start_time")
    @JsonProperty("start_time")
    private Date start_time;

    @MapKey(name = "end_time")
    @JsonProperty("end_time")
    private Date end_time;

    public Integer getState_id() {
        return state_id;
    }

    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    public Integer getCab_id() {
        return cab_id;
    }

    public void setCab_id(Integer cab_id) {
        this.cab_id = cab_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
