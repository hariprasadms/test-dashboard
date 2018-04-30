package com.mogalli.jspjstldemo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Build {

	public Automation_build automation_build;
	public List<Sessions> sessions;

	public Build() {
		super();
	}

	public Automation_build getAutomation_build() {
		return automation_build;
	}

	public void setAutomation_build(Automation_build automation_build) {
		this.automation_build = automation_build;
	}

	public List<Sessions> getSessions() {
		return sessions;
	}

	public void setSessions(List<Sessions> sessions) {
		this.sessions = sessions;
	}

	@Override
	public String toString() {
		return "Build [automation_build=" + automation_build + ", sessions=" + sessions + "]";
	}


}
