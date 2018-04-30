package com.mogalli.jspjstldemo.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sessions {

	public Automation_session automation_session;

	public Sessions() {
	}

	public Automation_session getAutomation_session() {
		return automation_session;
	}

	public void setAutomation_session(Automation_session automation_session) {
		this.automation_session = automation_session;
	}

	@Override
	public String toString() {
		return "Sessions [automation_session=" + automation_session + "]";
	}

}
