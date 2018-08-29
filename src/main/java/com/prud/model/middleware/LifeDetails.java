package com.prud.model.middleware;

import java.math.BigInteger;

public class LifeDetails {
	private String lifeId;
	private String lifeParty;
	private BigInteger anbAge;
	private BigInteger dateOfBirth;
	private String occupationCode;
	private String relationshipToLifeInsured;
	private String selection;
	private String sex;
	private String smokingIndicator;
	private BigInteger height;
	private BigInteger weight;

	public String getLifeId() {
		return lifeId;
	}

	public void setLifeId(String lifeId) {
		this.lifeId = lifeId;
	}

	public String getLifeParty() {
		return lifeParty;
	}

	public void setLifeParty(String lifeParty) {
		this.lifeParty = lifeParty;
	}

	public BigInteger getAnbAge() {
		return anbAge;
	}

	public void setAnbAge(BigInteger anbAge) {
		this.anbAge = anbAge;
	}

	public BigInteger getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(BigInteger dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getOccupationCode() {
		return occupationCode;
	}

	public void setOccupationCode(String occupationCode) {
		this.occupationCode = occupationCode;
	}

	public String getRelationshipToLifeInsured() {
		return relationshipToLifeInsured;
	}

	public void setRelationshipToLifeInsured(String relationshipToLifeInsured) {
		this.relationshipToLifeInsured = relationshipToLifeInsured;
	}

	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSmokingIndicator() {
		return smokingIndicator;
	}

	public void setSmokingIndicator(String smokingIndicator) {
		this.smokingIndicator = smokingIndicator;
	}

	public BigInteger getHeight() {
		return height;
	}

	public void setHeight(BigInteger height) {
		this.height = height;
	}

	public BigInteger getWeight() {
		return weight;
	}

	public void setWeight(BigInteger weight) {
		this.weight = weight;
	}

}
