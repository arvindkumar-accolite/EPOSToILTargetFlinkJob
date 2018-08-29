package com.prud.model.middleware;

import java.util.ArrayList;
import java.util.List;

public class SpecialTerms {
	private List<SpecialTermDetails> specialterms;

	public List<SpecialTermDetails> getSpecialterms() {
		if(specialterms==null) {
			specialterms = new ArrayList<SpecialTermDetails>();
		}
		return specialterms;
	}

	public void setSpecialterms(List<SpecialTermDetails> specialterms) {
		this.specialterms = specialterms;
	}

}
