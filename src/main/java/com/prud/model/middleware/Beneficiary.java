package com.prud.model.middleware;

import java.util.ArrayList;
import java.util.List;

public class Beneficiary {
	private String beneficiaryId;
	private List<BeneficiaryDetails> beneficiaryDetails;

	public String getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public List<BeneficiaryDetails> getBeneficiaryDetails() {
		if (null == beneficiaryDetails) {
			beneficiaryDetails = new ArrayList<>();
		}
		return beneficiaryDetails;
	}

	public void setBeneficiaryDetails(List<BeneficiaryDetails> beneficiaryDetails) {
		this.beneficiaryDetails = beneficiaryDetails;
	}

}
