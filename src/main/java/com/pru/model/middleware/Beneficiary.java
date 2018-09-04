
package com.pru.model.middleware;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "beneficiaryId",
    "beneficiaryDetails"
})
public class Beneficiary {

    @JsonProperty("beneficiaryId")
    private String beneficiaryId;
    @JsonProperty("beneficiaryDetails")
    private List<BeneficiaryDetails> beneficiaryDetails = null;
   

    @JsonProperty("beneficiaryId")
    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    @JsonProperty("beneficiaryId")
    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    @JsonProperty("beneficiaryDetails")
    public List<BeneficiaryDetails> getBeneficiaryDetails() {
    	if(null==beneficiaryDetails) {
    		beneficiaryDetails = new ArrayList<BeneficiaryDetails>();
    	}
        return beneficiaryDetails;
    }

    @JsonProperty("beneficiaryDetails")
    public void setBeneficiaryDetails(List<BeneficiaryDetails> beneficiaryDetails) {
        this.beneficiaryDetails = beneficiaryDetails;
    }
}
