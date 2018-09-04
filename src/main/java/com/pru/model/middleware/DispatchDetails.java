
package com.pru.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "despatchId",
    "despatchParty"
})
public class DispatchDetails {

    @JsonProperty("despatchId")
    private String despatchId;
    @JsonProperty("despatchParty")
    private String despatchParty;
   
    @JsonProperty("despatchId")
    public String getDespatchId() {
        return despatchId;
    }

    @JsonProperty("despatchId")
    public void setDespatchId(String despatchId) {
        this.despatchId = despatchId;
    }

    @JsonProperty("despatchParty")
    public String getDespatchParty() {
        return despatchParty;
    }

    @JsonProperty("despatchParty")
    public void setDespatchParty(String despatchParty) {
        this.despatchParty = despatchParty;
    }

}
