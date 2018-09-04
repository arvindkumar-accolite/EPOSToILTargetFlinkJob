
package com.pru.model.middleware;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "followUpsId",
    "zDoctor",
    "followUpsDetails"
})
public class FollowUps {

    @JsonProperty("followUpsId")
    private String followUpsId;
    @JsonProperty("zDoctor")
    private String zDoctor;
    @JsonProperty("followUpsDetails")
    private List<FollowUpsDetails> followUpsDetails = null;
    
    @JsonProperty("followUpsId")
    public String getFollowUpsId() {
        return followUpsId;
    }

    @JsonProperty("followUpsId")
    public void setFollowUpsId(String followUpsId) {
        this.followUpsId = followUpsId;
    }

    @JsonProperty("zDoctor")
    public String getZDoctor() {
        return zDoctor;
    }

    @JsonProperty("zDoctor")
    public void setZDoctor(String zDoctor) {
        this.zDoctor = zDoctor;
    }

    @JsonProperty("followUpsDetails")
    public List<FollowUpsDetails> getFollowUpsDetails() {
    	if(null==followUpsDetails) {
    		followUpsDetails = new ArrayList<FollowUpsDetails>();
    	}
        return followUpsDetails;
    }

    @JsonProperty("followUpsDetails")
    public void setFollowUpsDetails(List<FollowUpsDetails> followUpsDetails) {
        this.followUpsDetails = followUpsDetails;
    }
}
