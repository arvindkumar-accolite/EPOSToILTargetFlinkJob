
package com.pru.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "payerId",
    "payerParty"
})
public class PayerDetails {

    @JsonProperty("payerId")
    private String payerId;
    @JsonProperty("payerParty")
    private String payerParty;
   
    @JsonProperty("payerId")
    public String getPayerId() {
        return payerId;
    }

    @JsonProperty("payerId")
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    @JsonProperty("payerParty")
    public String getPayerParty() {
        return payerParty;
    }

    @JsonProperty("payerParty")
    public void setPayerParty(String payerParty) {
        this.payerParty = payerParty;
    }
}
