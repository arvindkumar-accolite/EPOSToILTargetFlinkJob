
package com.pru.model.middleware;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "jointOwnerId", "jointOwnerParty" })
public class JointOwnerDetails {

	@JsonProperty("jointOwnerId")
	private String jointOwnerId;
	@JsonProperty("jointOwnerParty")
	private String jointOwnerParty;

	@JsonProperty("jointOwnerId")
	public String getJointOwnerId() {
		return jointOwnerId;
	}

	@JsonProperty("jointOwnerId")
	public void setJointOwnerId(String jointOwnerId) {
		this.jointOwnerId = jointOwnerId;
	}

	@JsonProperty("jointOwnerParty")
	public String getJointOwnerParty() {
		return jointOwnerParty;
	}

	@JsonProperty("jointOwnerParty")
	public void setJointOwnerParty(String jointOwnerParty) {
		this.jointOwnerParty = jointOwnerParty;
	}
}
