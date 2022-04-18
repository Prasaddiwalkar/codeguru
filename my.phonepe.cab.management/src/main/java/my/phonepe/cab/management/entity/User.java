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

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public Location getBase_location() {
        return base_location;
    }

    public void setBase_location(Location base_location) {
        this.base_location = base_location;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Long getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(Long mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}
