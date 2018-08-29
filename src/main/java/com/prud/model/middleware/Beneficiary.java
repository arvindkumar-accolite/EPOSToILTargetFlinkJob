package com.prud.model.middleware;

import java.util.List;

public class Beneficiary {
	private String beneficiaryId;
	private List<BeneficiaryDetails> beneficiaries;

	public String getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public List<BeneficiaryDetails> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<BeneficiaryDetails> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

}
