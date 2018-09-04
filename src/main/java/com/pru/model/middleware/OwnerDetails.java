
package com.pru.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ownerentId",
    "ownerParty"
})
public class OwnerDetails {

    @JsonProperty("ownerentId")
    private String ownerentId;
    @JsonProperty("ownerParty")
    private String ownerParty;
   
    @JsonProperty("ownerentId")
    public String getOwnerentId() {
        return ownerentId;
    }

    @JsonProperty("ownerentId")
    public void setOwnerentId(String ownerentId) {
        this.ownerentId = ownerentId;
    }

    @JsonProperty("ownerParty")
    public String getOwnerParty() {
        return ownerParty;
    }

    @JsonProperty("ownerParty")
    public void setOwnerParty(String ownerParty) {
        this.ownerParty = ownerParty;
    }
}
