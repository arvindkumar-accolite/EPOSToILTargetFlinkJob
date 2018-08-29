package com.prud.model.middleware;

import java.math.BigInteger;

public class FollowUpsDetails {
    private String followUpCode;
    private BigInteger followUpDate;
    private BigInteger followUpNumber;
    private String followUpStatus;
    private BigInteger lifeNumber;
    private BigInteger jointLifeNumber;
    private String followUpType;
	public String getFollowUpCode() {
		return followUpCode;
	}
	public void setFollowUpCode(String followUpCode) {
		this.followUpCode = followUpCode;
	}
	public BigInteger getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(BigInteger followUpDate) {
		this.followUpDate = followUpDate;
	}
	public BigInteger getFollowUpNumber() {
		return followUpNumber;
	}
	public void setFollowUpNumber(BigInteger followUpNumber) {
		this.followUpNumber = followUpNumber;
	}
	public String getFollowUpStatus() {
		return followUpStatus;
	}
	public void setFollowUpStatus(String followUpStatus) {
		this.followUpStatus = followUpStatus;
	}
	public BigInteger getLifeNumber() {
		return lifeNumber;
	}
	public void setLifeNumber(BigInteger lifeNumber) {
		this.lifeNumber = lifeNumber;
	}
	public BigInteger getJointLifeNumber() {
		return jointLifeNumber;
	}
	public void setJointLifeNumber(BigInteger jointLifeNumber) {
		this.jointLifeNumber = jointLifeNumber;
	}
	public String getFollowUpType() {
		return followUpType;
	}
	public void setFollowUpType(String followUpType) {
		this.followUpType = followUpType;
	}
}
