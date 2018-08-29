package com.prud.model.middleware;

import java.util.ArrayList;
import java.util.List;

public class FollowUps {
	private String followUpsId;
	private String zDoctor;
	private List<FollowUpsDetails> nbscrtifups;

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

	public List<FollowUpsDetails> getNbscrtifups() {
		if(nbscrtifups==null) {
			nbscrtifups= new ArrayList<>();
		}
		return nbscrtifups;
	}

	public void setNbscrtifups(List<FollowUpsDetails> nbscrtifups) {
		this.nbscrtifups = nbscrtifups;
	}

}
