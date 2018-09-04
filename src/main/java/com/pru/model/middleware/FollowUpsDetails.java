
package com.pru.model.middleware;

import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "followUpCode", "followUpDate", "followUpNumber", "followUpStatus", "lifeNumber",
		"jointLifeNumber", "followUpType" })
public class FollowUpsDetails {

	@JsonProperty("followUpCode")
	private String followUpCode;
	@JsonProperty("followUpDate")
	private String followUpDate;
	@JsonProperty("followUpNumber")
	private BigInteger followUpNumber;
	@JsonProperty("followUpStatus")
	private String followUpStatus;
	@JsonProperty("lifeNumber")
	private BigInteger lifeNumber;
	@JsonProperty("jointLifeNumber")
	private BigInteger jointLifeNumber;
	@JsonProperty("followUpType")
	private String followUpType;

	@JsonProperty("followUpCode")
	public String getFollowUpCode() {
		return followUpCode;
	}

	@JsonProperty("followUpCode")
	public void setFollowUpCode(String followUpCode) {
		this.followUpCode = followUpCode;
	}

	@JsonProperty("followUpDate")
	public String getFollowUpDate() {
		return followUpDate;
	}

	@JsonProperty("followUpDate")
	public void setFollowUpDate(String followUpDate) {
		this.followUpDate = followUpDate;
	}

	@JsonProperty("followUpNumber")
	public BigInteger getFollowUpNumber() {
		return followUpNumber;
	}

	@JsonProperty("followUpNumber")
	public void setFollowUpNumber(BigInteger followUpNumber) {
		this.followUpNumber = followUpNumber;
	}

	@JsonProperty("followUpStatus")
	public String getFollowUpStatus() {
		return followUpStatus;
	}

	@JsonProperty("followUpStatus")
	public void setFollowUpStatus(String followUpStatus) {
		this.followUpStatus = followUpStatus;
	}

	@JsonProperty("lifeNumber")
	public BigInteger getLifeNumber() {
		return lifeNumber;
	}

	@JsonProperty("lifeNumber")
	public void setLifeNumber(BigInteger lifeNumber) {
		this.lifeNumber = lifeNumber;
	}

	@JsonProperty("jointLifeNumber")
	public BigInteger getJointLifeNumber() {
		return jointLifeNumber;
	}

	@JsonProperty("jointLifeNumber")
	public void setJointLifeNumber(BigInteger jointLifeNumber) {
		this.jointLifeNumber = jointLifeNumber;
	}

	@JsonProperty("followUpType")
	public String getFollowUpType() {
		return followUpType;
	}

	@JsonProperty("followUpType")
	public void setFollowUpType(String followUpType) {
		this.followUpType = followUpType;
	}

}
