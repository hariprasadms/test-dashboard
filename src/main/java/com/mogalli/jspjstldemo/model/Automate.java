package com.mogalli.jspjstldemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("all")
public class Automate {

	private Projects project;
	private Automation_build automation_build;
	private Automation_session automation_session;
	private Build build;
	private Plan plan;
	
	
	public Automate() {

	}

	public Automation_build getAutomation_build() {
		return automation_build;
	}

	public void setAutomation_build(Automation_build automation_build) {
		this.automation_build = automation_build;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}

	public Automation_session getAutomation_sessions() {
		return automation_session;
	}

	public void setAutomation_sessions(Automation_session automation_session) {
		this.automation_session = automation_session;
	}

	public Automation_session getAutomation_session() {
		return automation_session;
	}

	public void setAutomation_session(Automation_session automation_session) {
		this.automation_session = automation_session;
	}

	public Build getBuild() {
		return build;
	}

	public void setBuild(Build build) {
		this.build = build;
	}

	@Override
	public String toString() {
		return "Browserstack [project=" + project + ", automation_build=" + automation_build + ", automation_session="
				+ automation_session + ", build=" + build + "]";
	}

}
