package com.prud.model.middleware;

import java.util.ArrayList;
import java.util.List;

public class FollowUps {
	private String followUpsId;
	private String zDoctor;
	private List<FollowUpDetails> followUpDetails;

	public String getFollowUpsId() {
		return followUpsId;
	}

	public void setFollowUpsId(String followUpsId) {
		this.followUpsId = followUpsId;
	}

	public String getzDoctor() {
		return zDoctor;
	}

	public void setzDoctor(String zDoctor) {
		this.zDoctor = zDoctor;
	}

	/**
	 * @return the followUpDetails
	 */
	public List<FollowUpDetails> getFollowUpDetails() {
		if (followUpDetails == null) {
			followUpDetails = new ArrayList<>();
		}
		return this.followUpDetails;
	}

	/**
	 * @param followUpDetails
	 *            the followUpDetails to set
	 */
	public void setFollowUpDetails(List<FollowUpDetails> followUpDetails) {
		this.followUpDetails = followUpDetails;
	}

}
