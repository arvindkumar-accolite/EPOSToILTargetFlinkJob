
package com.pru.model.middleware;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "specialTermsDetails" })
public class SpecialTerms {

	@JsonProperty("specialTermsDetails")
	private List<SpecialTermDetails> specialTermsDetails = null;

	@JsonProperty("specialTermsDetails")
	public List<SpecialTermDetails> getSpecialTermDetails() {
		if(null==specialTermsDetails) {
			specialTermsDetails = new ArrayList<>();
		}
		return specialTermsDetails;
	}

	@JsonProperty("specialTermsDetails")
	public void setSpecialTermDetails(List<SpecialTermDetails> specialTermsDetails) {
		this.specialTermsDetails = specialTermsDetails;
	}

}
