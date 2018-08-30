package com.prud.mapper.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prud.model.jpath.NewBusinessJpathModel;
import com.prud.model.middleware.ApplyCashDetails;
import com.prud.model.middleware.AssigneeDetails;
import com.prud.model.middleware.Assignees;
import com.prud.model.middleware.BankDetails;
import com.prud.model.middleware.Beneficiary;
import com.prud.model.middleware.BeneficiaryDetails;
import com.prud.model.middleware.ClientDetails;
import com.prud.model.middleware.ContractDetails;
import com.prud.model.middleware.CoverageDetails;
import com.prud.model.middleware.DispatchDetails;
import com.prud.model.middleware.DoctorDetails;
import com.prud.model.middleware.FollowUps;
import com.prud.model.middleware.FollowUpsDetails;
import com.prud.model.middleware.FundDetails;
import com.prud.model.middleware.JointOwnerDetails;
import com.prud.model.middleware.LifeDetails;
import com.prud.model.middleware.MandateDetails;
import com.prud.model.middleware.NewBusinessModel;
import com.prud.model.middleware.OwnerDetails;
import com.prud.model.middleware.PayerDetails;
import com.prud.model.middleware.PremiumRCTDetails;
import com.prud.model.middleware.QuestionDetails;
import com.prud.model.middleware.RiderDetails;
import com.prud.model.middleware.SFLDetails;
import com.prud.model.middleware.SpecialTermDetails;
import com.prud.model.middleware.SpecialTerms;

public class NewBusinessPopulator {
	private NewBusinessJpathModel jpathModel;

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		NewBusinessPopulator nbspop = new NewBusinessPopulator();
		ObjectMapper mapper = new ObjectMapper();
		NewBusinessModel nbsModel = nbspop.buildNewBusiness();
		System.out.println("meeee");
		// Object to JSON in file
		mapper.writeValue(System.out, nbsModel);
		System.out.println();
		// Object to JSON in String
		/*ApplyCashDetails applyCashDetails = mapper.readValue("{\"applyCashId\":\"s\",\"receiptNo\":\"\"}}",ApplyCashDetails.class);
		 System.out.println(applyCashDetails.getApplyCashId());*/
		 
	}

	public NewBusinessModel buildNewBusiness() {
		NewBusinessModel nbsModel = new NewBusinessModel();
		nbsModel.setApplyCashDetails(populateApplyCashDetails());
		nbsModel.setAssignees(populateAssignees());
		nbsModel.setBankDetails(populateBankDetails());
		nbsModel.setBeneficiary(populateBeneficiary());
		nbsModel.getClientDetails().add(populateClientDetails());
		nbsModel.setContractDetails(populateContractDetails());
		nbsModel.getCoverageDetails().add(populateCoverageDetails());
		nbsModel.setDispatchDetails(populateDispatchDetails());
		nbsModel.setDoctorDetails(populateDoctorDetails());
		nbsModel.setFollowUps(populateFollowUps());
		nbsModel.getFundDetails().add(populateFundDetails());
		nbsModel.setJointOwnerDetails(populateJointOwnerDetails());
		nbsModel.getLifeDetails().add(populateLifeDetails());
		nbsModel.setMandateDetails(populateMandateDetails());
		nbsModel.setOwnerDetails(populateOwnerDetails());
		nbsModel.setPayerDetails(populatePayerDetails());
		nbsModel.setPremiumRCTDetails(populatePremiumRCTDetails());
		nbsModel.getQuestionDetails().add(populateQuestionDetails());
		nbsModel.getRiderDetails().add(populateRiderDetails());
		nbsModel.setSpecialTerms(populateSpecialTerms());
		return nbsModel;
	}

	private ApplyCashDetails populateApplyCashDetails() {
		ApplyCashDetails applyCashDetails = new ApplyCashDetails();
		applyCashDetails.setApplyCashId("");
		applyCashDetails.setReceiptNo("");
		return applyCashDetails;
	}

	private AssigneeDetails populateAssigneeDetails() {
		AssigneeDetails assigneeDetails = new AssigneeDetails();
		assigneeDetails.setAssigneeParty("");
		assigneeDetails.setCommissionFromDate(new BigInteger("1"));
		assigneeDetails.setCommissionToDate(new BigInteger("1"));
		assigneeDetails.setReasonCode("");
		return assigneeDetails;
	}

	private Assignees populateAssignees() {
		Assignees assignees = new Assignees();
		assignees.setAssigneeId("");
		assignees.getAssigneeDetails().add(populateAssigneeDetails());
		return assignees;
	}

	private BankDetails populateBankDetails() {
		BankDetails bankDetails = new BankDetails();
		bankDetails.setBankAccountDesc("");
		bankDetails.setBankAccountId("");
		bankDetails.setBankAccountKey("");
		bankDetails.setBankKey("");
		bankDetails.setClientSelectionWithBankDetails("");
		bankDetails.setCurrencyCode("");
		bankDetails.setDatefrom("");
		bankDetails.setFactoringHouse("");
		return bankDetails;
	}

	private Beneficiary populateBeneficiary() {
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setBeneficiaryId("");
		BeneficiaryDetails beneficiaryDetail = populateBeneficiaryDetails();
		beneficiary.getBeneficiaryDetails().add(beneficiaryDetail);
		return beneficiary;
	}

	private BeneficiaryDetails populateBeneficiaryDetails() {
		BeneficiaryDetails beneficiaryDetail = new BeneficiaryDetails();
		beneficiaryDetail.setBeneficiaryClientNumber("");
		beneficiaryDetail.setBeneficiaryParty("");
		beneficiaryDetail.setBeneficiaryPercentage(new BigDecimal("0"));
		beneficiaryDetail.setBeneficiaryType("");
		beneficiaryDetail.setClientRelationship("");
		beneficiaryDetail.setEffectiveDate(new BigInteger("1"));
		return beneficiaryDetail;
	}

	private ClientDetails populateClientDetails() {
		ClientDetails clientDetails = new ClientDetails();
		clientDetails.setAddress01("");
		clientDetails.setAddress02("");
		clientDetails.setAddress03("");
		clientDetails.setAddress04("");
		clientDetails.setAddressType("");
		clientDetails.setBirthPlace("");
		clientDetails.setClientNumber("");
		clientDetails.setClientType("");
		clientDetails.setCorporateName("");
		clientDetails.setCountryCode("");
		clientDetails.setDateOfBirth("");
		clientDetails.setDirectMailIndicator("");
		clientDetails.setDocumentNumber("");
		clientDetails.setEmail("");
		clientDetails.setEntId("");
		clientDetails.setEthnicOrigin("");
		clientDetails.setForTheAttentionOf("");
		clientDetails.setForTheAttentionOf("");
		clientDetails.setGender("");
		clientDetails.setGivenName("");
		clientDetails.setLanguage("");
		clientDetails.setMailingIndicator("");
		clientDetails.setMarriedIndicator("");
		clientDetails.setMiddleName01("");
		clientDetails.setMiddleName02("");
		clientDetails.setNationality("");
		clientDetails.setOccupationCode("");
		clientDetails.setParty("");
		clientDetails.setPhone01("");
		clientDetails.setPhone02("");
		clientDetails.setPostalCode("");
		clientDetails.setPrefCom("");
		clientDetails.setSalutaion("");
		clientDetails.setSecurityNumber("");
		clientDetails.setSourceOfEvidence("");
		clientDetails.setStatusCode("");
		clientDetails.setSurName("");
		clientDetails.setVipIndicator("");
		return clientDetails;
	}

	private ContractDetails populateContractDetails() {
		ContractDetails contractDetails = new ContractDetails();
		contractDetails.setAccountType("");
		contractDetails.setAgentNumber("");
		contractDetails.setBillingCurrency("");
		contractDetails.setBillingfrequency("");
		contractDetails.setBillingRenewalDate("");
		contractDetails.setBillingRenewalIndicator(new BigInteger("1"));
		contractDetails.setContractCurrency("");
		contractDetails.setContractHDREntId("");
		contractDetails.setContractNumber("");
		contractDetails.setContractType("");
		contractDetails.setMethodOfPayment("");
		contractDetails.setOriginalCommencementDate(new BigInteger("1"));
		contractDetails.setPlanSuffix(new BigInteger("1"));
		contractDetails.setProposalDate(new BigInteger("1"));
		contractDetails.setRegister("");
		return contractDetails;
	}

	private CoverageDetails populateCoverageDetails() {
		CoverageDetails coverageDetails = new CoverageDetails();
		coverageDetails.setCoverageId("");
		coverageDetails.setCoverageOrRiderInstalmentAmount(new BigDecimal("1"));
		coverageDetails.setCoverageOrRiderTable("");
		coverageDetails.setCoverageParent("");
		coverageDetails.setLumpSumContribution(new BigDecimal("1"));
		coverageDetails.setMortalityClass("");
		coverageDetails.setPremiumCessationAge(new BigInteger("1"));
		coverageDetails.setPremiumCessationDate(new BigInteger("1"));
		coverageDetails.setPremiumCessationTerm(new BigInteger("1"));
		coverageDetails.setReserveUnitsAllocationDate(new BigInteger("1"));
		coverageDetails.setReserveUnitsIndicator("");
		coverageDetails.setRiskCessationAge(new BigInteger("1"));
		coverageDetails.setRiskCessationDate(new BigInteger("1"));
		coverageDetails.setRiskCessationTerm(new BigInteger("1"));
		coverageDetails.setSumInsured(new BigInteger("1"));
		return coverageDetails;
	}

	private DispatchDetails populateDispatchDetails() {
		DispatchDetails dispatchDetails = new DispatchDetails();
		dispatchDetails.setDespatchId("");
		dispatchDetails.setDespatchParty("");
		return dispatchDetails;
	}

	private DoctorDetails populateDoctorDetails() {
		DoctorDetails doctorDetails = new DoctorDetails();
		doctorDetails.setDoctorId("");
		doctorDetails.setDoctorParent("");
		doctorDetails.setDoctorParty("");
		doctorDetails.setDoctorType("");
		return doctorDetails;
	}

	private FollowUps populateFollowUps() {
		FollowUps followUps = new FollowUps();
		followUps.setFollowUpsId("");
		followUps.setZDoctor("");
		FollowUpsDetails followUpsDetail = populateFollowUpsDetails();
		followUps.getFollowUpsDetails().add(followUpsDetail);
		return followUps;
	}

	private FollowUpsDetails populateFollowUpsDetails() {
		FollowUpsDetails followUpsDetail = new FollowUpsDetails();
		followUpsDetail.setFollowUpCode("");
		followUpsDetail.setFollowUpDate(new BigInteger("1"));
		followUpsDetail.setFollowUpNumber(new BigInteger("1"));
		followUpsDetail.setFollowUpStatus("");
		followUpsDetail.setFollowUpType("");
		followUpsDetail.setJointLifeNumber(new BigInteger("1"));
		followUpsDetail.setLifeNumber(new BigInteger("1"));
		return followUpsDetail;
	}

	private FundDetails populateFundDetails() {
		FundDetails fundDetails = new FundDetails();
		fundDetails.setAmount01(new BigDecimal("0"));
		fundDetails.setAmount02(new BigDecimal("0"));
		fundDetails.setAmount03(new BigDecimal("0"));
		fundDetails.setAmount04(new BigDecimal("0"));
		fundDetails.setAmount05(new BigDecimal("0"));
		fundDetails.setAmount06(new BigDecimal("0"));
		fundDetails.setAmount07(new BigDecimal("0"));
		fundDetails.setAmount08(new BigDecimal("0"));
		fundDetails.setAmount09(new BigDecimal("0"));
		fundDetails.setAmount10(new BigDecimal("0"));
		fundDetails.setFundId("");
		fundDetails.setFundParent("");
		fundDetails.setInterateRate01(new BigDecimal("0"));
		fundDetails.setInterateRate02(new BigDecimal("0"));
		fundDetails.setInterateRate03(new BigDecimal("0"));
		fundDetails.setInterateRate04(new BigDecimal("0"));
		fundDetails.setInterateRate05(new BigDecimal("0"));
		fundDetails.setInterateRate06(new BigDecimal("0"));
		fundDetails.setInterateRate07(new BigDecimal("0"));
		fundDetails.setInterateRate08(new BigDecimal("0"));
		fundDetails.setInterateRate09(new BigDecimal("0"));
		fundDetails.setInterateRate10(new BigDecimal("0"));
		fundDetails.setPercentageOfAmountIndicator("");
		fundDetails.setRenewalMonths01(new BigInteger("0"));
		fundDetails.setRenewalMonths02(new BigInteger("0"));
		fundDetails.setRenewalMonths03(new BigInteger("0"));
		fundDetails.setRenewalMonths04(new BigInteger("0"));
		fundDetails.setRenewalMonths05(new BigInteger("0"));
		fundDetails.setRenewalMonths06(new BigInteger("0"));
		fundDetails.setRenewalMonths07(new BigInteger("0"));
		fundDetails.setRenewalMonths08(new BigInteger("0"));
		fundDetails.setRenewalMonths09(new BigInteger("0"));
		fundDetails.setRenewalMonths10(new BigInteger("0"));
		fundDetails.setUnitLinkedFund01("");
		fundDetails.setUnitLinkedFund02("");
		fundDetails.setUnitLinkedFund03("");
		fundDetails.setUnitLinkedFund04("");
		fundDetails.setUnitLinkedFund05("");
		fundDetails.setUnitLinkedFund06("");
		fundDetails.setUnitLinkedFund07("");
		fundDetails.setUnitLinkedFund08("");
		fundDetails.setUnitLinkedFund09("");
		fundDetails.setUnitLinkedFund10("");
		fundDetails.setVirtualFundSplitMethod("");
		fundDetails.setYearsInForce01(new BigInteger("0"));
		fundDetails.setYearsInForce02(new BigInteger("0"));
		fundDetails.setYearsInForce03(new BigInteger("0"));
		fundDetails.setYearsInForce04(new BigInteger("0"));
		fundDetails.setYearsInForce05(new BigInteger("0"));
		fundDetails.setYearsInForce06(new BigInteger("0"));
		fundDetails.setYearsInForce07(new BigInteger("0"));
		fundDetails.setYearsInForce08(new BigInteger("0"));
		fundDetails.setYearsInForce09(new BigInteger("0"));
		fundDetails.setYearsInForce10(new BigInteger("0"));
		return fundDetails;
	}

	private JointOwnerDetails populateJointOwnerDetails() {
		JointOwnerDetails jointOwnerDetails = new JointOwnerDetails();
		jointOwnerDetails.setJointOwnerId("");
		jointOwnerDetails.setJointOwnerParty("");
		return jointOwnerDetails;
	}

	private LifeDetails populateLifeDetails() {
		LifeDetails lifeDetails = new LifeDetails();
		lifeDetails.setAnbAge(new BigInteger("0"));
		lifeDetails.setDateOfBirth(new BigInteger("0"));
		lifeDetails.setHeight(new BigInteger("0"));
		lifeDetails.setLifeId("");
		lifeDetails.setLifeParty("");
		lifeDetails.setOccupationCode("");
		lifeDetails.setRelationshipToLifeInsured("");
		lifeDetails.setSelection("");
		lifeDetails.setSex("");
		lifeDetails.setSmokingIndicator("");
		lifeDetails.setWeight(new BigInteger("0"));
		return lifeDetails;
	}

	private MandateDetails populateMandateDetails() {
		MandateDetails mandateDetails = new MandateDetails();
		mandateDetails.setBankAccountKey("");
		mandateDetails.setBankKey("");
		mandateDetails.setClientNumber("");
		mandateDetails.setEffectiveDate("");
		mandateDetails.setFactoringHouse("");
		mandateDetails.setMandateId("");
		mandateDetails.setMandateRefNumber("");
		mandateDetails.setMandateStatus("");
		mandateDetails.setTimesToUse(new BigInteger("0"));
		return mandateDetails;
	}

	private OwnerDetails populateOwnerDetails() {
		OwnerDetails ownerDetails = new OwnerDetails();
		ownerDetails.setOwnerentId("");
		ownerDetails.setOwnerParty("");
		return ownerDetails;
	}

	private PayerDetails populatePayerDetails() {
		PayerDetails payerDetails = new PayerDetails();
		payerDetails.setPayerId("");
		payerDetails.setPayerParty("");
		return payerDetails;
	}

	private PremiumRCTDetails populatePremiumRCTDetails() {
		PremiumRCTDetails premiumRCTDetails = new PremiumRCTDetails();
		premiumRCTDetails.setBankCode("");
		premiumRCTDetails.setBankDesc01("");
		premiumRCTDetails.setBankDesc02("");
		premiumRCTDetails.setBankDesc03("");
		premiumRCTDetails.setBankedFlag("");
		premiumRCTDetails.setBankKey("");
		premiumRCTDetails.setCheqNumber("");
		premiumRCTDetails.setCurrencyRate(new BigDecimal("0"));
		premiumRCTDetails.setDissectionNumber(new BigDecimal("0"));
		premiumRCTDetails.setDocumentAmount(new BigDecimal("0"));
		premiumRCTDetails.setOriginalCurrency("");
		premiumRCTDetails.setPaymentType("");
		premiumRCTDetails.setPremiumRCTId("");
		premiumRCTDetails.setProtectIndicator("");
		premiumRCTDetails.setRecievedFromCode("");
		premiumRCTDetails.setRecievedFromNumber("");
		premiumRCTDetails.getSfldetails().add(populateSFLDetails());
		premiumRCTDetails.setTranDate("");
		return premiumRCTDetails;
	}

	private QuestionDetails populateQuestionDetails() {
		QuestionDetails questionDetails = new QuestionDetails();
		questionDetails.setAnswer("");
		questionDetails.setQuestionId("");
		questionDetails.setQuestionParent("");
		return questionDetails;
	}

	private RiderDetails populateRiderDetails() {
		RiderDetails riderDetails = new RiderDetails();
		riderDetails.setCoverageOrRiderInstalmentAmount(new BigDecimal("0"));
		riderDetails.setCoverageOrRiderTable("");
		riderDetails.setMortalityClass("");
		riderDetails.setPremiumCessationAge(new BigInteger("0"));
		riderDetails.setPremiumCessationTerm(new BigInteger("0"));
		riderDetails.setRiderId("");
		riderDetails.setRiderParent("");
		riderDetails.setRiskCessationAge(new BigInteger("0"));
		riderDetails.setRiskCessationTerm(new BigInteger("0"));
		riderDetails.setSumInsured(new BigInteger("0"));
		return riderDetails;
	}

	private SFLDetails populateSFLDetails() {
		SFLDetails sflDetails = new SFLDetails();
		sflDetails.setAmountInOriginalCurrency(new BigDecimal("0"));
		sflDetails.setEntity("");
		sflDetails.setSubAccountCode("");
		sflDetails.setSubAccountType("");
		return sflDetails;
	}

	private SpecialTerms populateSpecialTerms() {
		SpecialTerms specialTerms = new SpecialTerms();
		specialTerms.getSpecialTermDetails().add(populateSpecialTermDetails());
		return specialTerms;
	}

	private SpecialTermDetails populateSpecialTermDetails() {
		SpecialTermDetails specialTermDetails = new SpecialTermDetails();
		specialTermDetails.setAdjustmentCode("");
		specialTermDetails.setAdjustmentDuration(new BigInteger("0"));
		specialTermDetails.setAdjustmentPercentage(new BigDecimal("0"));
		specialTermDetails.setAgeRating(new BigInteger("0"));
		specialTermDetails.setRateAdjustment(new BigInteger("0"));
		specialTermDetails.setReassuranceIndicator("");
		specialTermDetails.setSelectLineOfSubFile("");
		specialTermDetails.setSpecialTermId("");
		specialTermDetails.setSpecialTermParent("");
		return specialTermDetails;
	}
}
