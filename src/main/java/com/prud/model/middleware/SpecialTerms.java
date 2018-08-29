package com.prud.model.middleware;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "specialterms" })
public class SpecialTerms {

	@JsonProperty("specialterms")
	private List<SpecialTermDetails> specialterms;

	@JsonProperty("specialterms")
	public List<SpecialTermDetails> getSpecialterms() {
		if (specialterms == null) {
			specialterms = new ArrayList<SpecialTermDetails>();
		}
		return specialterms;
	}

	@JsonProperty("specialterms")
	public void setSpecialterms(List<SpecialTermDetails> specialterms) {
		this.specialterms = specialterms;
	}

}
