
package com.pru.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "doctorId",
    "doctorParent",
    "doctorParty",
    "doctorType"
})
public class DoctorDetails {

    @JsonProperty("doctorId")
    private String doctorId;
    @JsonProperty("doctorParent")
    private String doctorParent;
    @JsonProperty("doctorParty")
    private String doctorParty;
    @JsonProperty("doctorType")
    private String doctorType;
  
    @JsonProperty("doctorId")
    public String getDoctorId() {
        return doctorId;
    }

    @JsonProperty("doctorId")
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    @JsonProperty("doctorParent")
    public String getDoctorParent() {
        return doctorParent;
    }

    @JsonProperty("doctorParent")
    public void setDoctorParent(String doctorParent) {
        this.doctorParent = doctorParent;
    }

    @JsonProperty("doctorParty")
    public String getDoctorParty() {
        return doctorParty;
    }

    @JsonProperty("doctorParty")
    public void setDoctorParty(String doctorParty) {
        this.doctorParty = doctorParty;
    }

    @JsonProperty("doctorType")
    public String getDoctorType() {
        return doctorType;
    }

    @JsonProperty("doctorType")
    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }
}
