
package com.pru.model.middleware;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "applyCashDetails", "assignees", "bankDetails", "beneficiary", "clientDetails",
		"contractDetails", "coverageDetails", "dispatchDetails", "doctorDetails", "followUps", "fundDetails",
		"jointOwnerDetails", "lifeDetails", "mandateDetails", "ownerDetails", "payerDetails", "premiumRCTDetails",
		"questionDetails", "riderDetails", "specialTerms" })
public class NewBusinessModel {

	@JsonProperty("applyCashDetails")
	private ApplyCashDetails applyCashDetails;
	@JsonProperty("assignees")
	private Assignees assignees;
	@JsonProperty("bankDetails")
	private BankDetails bankDetails;
	@JsonProperty("beneficiary")
	private Beneficiary beneficiary;
	@JsonProperty("clientDetails")
	private List<ClientDetails> clientDetails;
	@JsonProperty("contractDetails")
	private ContractDetails contractDetails;
	@JsonProperty("coverageDetails")
	private List<CoverageDetails> coverageDetails;
	@JsonProperty("dispatchDetails")
	private DispatchDetails dispatchDetails;
	@JsonProperty("doctorDetails")
	private DoctorDetails doctorDetails;
	@JsonProperty("followUps")
	private FollowUps followUps;
	@JsonProperty("fundDetails")
	private List<FundDetails> fundDetails;
	@JsonProperty("jointOwnerDetails")
	private JointOwnerDetails jointOwnerDetails;
	@JsonProperty("lifeDetails")
	private List<LifeDetails> lifeDetails;
	@JsonProperty("mandateDetails")
	private MandateDetails mandateDetails;
	@JsonProperty("ownerDetails")
	private OwnerDetails ownerDetails;
	@JsonProperty("payerDetails")
	private PayerDetails payerDetails;
	@JsonProperty("premiumRCTDetails")
	private PremiumRCTDetails premiumRCTDetails;
	@JsonProperty("questionDetails")
	private List<QuestionDetails> questionDetails;
	@JsonProperty("riderDetails")
	private List<RiderDetails> riderDetails;
	@JsonProperty("specialTerms")
	private SpecialTerms specialTerms;

	@JsonProperty("applyCashDetails")
	public ApplyCashDetails getApplyCashDetails() {
		return applyCashDetails;
	}

	@JsonProperty("applyCashDetails")
	public void setApplyCashDetails(ApplyCashDetails applyCashDetails) {
		this.applyCashDetails = applyCashDetails;
	}

	@JsonProperty("assignees")
	public Assignees getAssignees() {
		return assignees;
	}

	@JsonProperty("assignees")
	public void setAssignees(Assignees assignees) {
		this.assignees = assignees;
	}

	@JsonProperty("bankDetails")
	public BankDetails getBankDetails() {
		return bankDetails;
	}

	@JsonProperty("bankDetails")
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	@JsonProperty("beneficiary")
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	@JsonProperty("beneficiary")
	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

	@JsonProperty("clientDetails")
	public List<ClientDetails> getClientDetails() {
		if (null == clientDetails) {
			clientDetails = new ArrayList<>();
		}
		return clientDetails;
	}

	@JsonProperty("clientDetails")
	public void setClientDetails(List<ClientDetails> clientDetails) {
		this.clientDetails = clientDetails;
	}

	@JsonProperty("contractDetails")
	public ContractDetails getContractDetails() {
		return contractDetails;
	}

	@JsonProperty("contractDetails")
	public void setContractDetails(ContractDetails contractDetails) {
		this.contractDetails = contractDetails;
	}

	@JsonProperty("coverageDetails")
	public List<CoverageDetails> getCoverageDetails() {
		if (null == coverageDetails) {
			coverageDetails = new ArrayList<>();
		}
		return coverageDetails;
	}

	@JsonProperty("coverageDetails")
	public void setCoverageDetails(List<CoverageDetails> coverageDetails) {
		this.coverageDetails = coverageDetails;
	}

	@JsonProperty("dispatchDetails")
	public DispatchDetails getDispatchDetails() {
		return dispatchDetails;
	}

	@JsonProperty("dispatchDetails")
	public void setDispatchDetails(DispatchDetails dispatchDetails) {
		this.dispatchDetails = dispatchDetails;
	}

	@JsonProperty("doctorDetails")
	public DoctorDetails getDoctorDetails() {
		return doctorDetails;
	}

	@JsonProperty("doctorDetails")
	public void setDoctorDetails(DoctorDetails doctorDetails) {
		this.doctorDetails = doctorDetails;
	}

	@JsonProperty("followUps")
	public FollowUps getFollowUps() {
		return followUps;
	}

	@JsonProperty("followUps")
	public void setFollowUps(FollowUps followUps) {
		this.followUps = followUps;
	}

	@JsonProperty("fundDetails")
	public List<FundDetails> getFundDetails() {
		if (null == fundDetails) {
			fundDetails = new ArrayList<>();
		}
		return fundDetails;
	}

	@JsonProperty("fundDetails")
	public void setFundDetails(List<FundDetails> fundDetails) {
		this.fundDetails = fundDetails;
	}

	@JsonProperty("jointOwnerDetails")
	public JointOwnerDetails getJointOwnerDetails() {
		return jointOwnerDetails;
	}

	@JsonProperty("jointOwnerDetails")
	public void setJointOwnerDetails(JointOwnerDetails jointOwnerDetails) {
		this.jointOwnerDetails = jointOwnerDetails;
	}

	@JsonProperty("lifeDetails")
	public List<LifeDetails> getLifeDetails() {
		if (null == fundDetails) {
			fundDetails = new ArrayList<>();
		}
		return lifeDetails;
	}

	@JsonProperty("lifeDetails")
	public void setLifeDetails(List<LifeDetails> lifeDetails) {
		this.lifeDetails = lifeDetails;
	}

	@JsonProperty("mandateDetails")
	public MandateDetails getMandateDetails() {
		return mandateDetails;
	}

	@JsonProperty("mandateDetails")
	public void setMandateDetails(MandateDetails mandateDetails) {
		this.mandateDetails = mandateDetails;
	}

	@JsonProperty("ownerDetails")
	public OwnerDetails getOwnerDetails() {
		return ownerDetails;
	}

	@JsonProperty("ownerDetails")
	public void setOwnerDetails(OwnerDetails ownerDetails) {
		this.ownerDetails = ownerDetails;
	}

	@JsonProperty("payerDetails")
	public PayerDetails getPayerDetails() {
		return payerDetails;
	}

	@JsonProperty("payerDetails")
	public void setPayerDetails(PayerDetails payerDetails) {
		this.payerDetails = payerDetails;
	}

	@JsonProperty("premiumRCTDetails")
	public PremiumRCTDetails getPremiumRCTDetails() {
		return premiumRCTDetails;
	}

	@JsonProperty("premiumRCTDetails")
	public void setPremiumRCTDetails(PremiumRCTDetails premiumRCTDetails) {
		this.premiumRCTDetails = premiumRCTDetails;
	}

	@JsonProperty("questionDetails")
	public List<QuestionDetails> getQuestionDetails() {
		if (null == questionDetails) {
			questionDetails = new ArrayList<>();
		}
		return questionDetails;
	}

	@JsonProperty("questionDetails")
	public void setQuestionDetails(List<QuestionDetails> questionDetails) {
		this.questionDetails = questionDetails;
	}

	@JsonProperty("riderDetails")
	public List<RiderDetails> getRiderDetails() {
		if (null == riderDetails) {
			riderDetails = new ArrayList<>();
		}
		return riderDetails;
	}

	@JsonProperty("riderDetails")
	public void setRiderDetails(List<RiderDetails> riderDetails) {
		this.riderDetails = riderDetails;
	}

	@JsonProperty("specialTerms")
	public SpecialTerms getSpecialTerms() {
		return specialTerms;
	}

	@JsonProperty("specialTerms")
	public void setSpecialTerms(SpecialTerms specialTerms) {
		this.specialTerms = specialTerms;
	}
}
