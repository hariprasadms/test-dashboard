package com.mogalli.jspjstldemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Automation_build {

	public String name;
	public int duration;
	public String hashed_id;
	public String status;

	public Automation_build() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHashed_id() {
		return hashed_id;
	}

	public void setHashed_id(String hashed_id) {
		this.hashed_id = hashed_id;
	}

	@Override
	public String toString() {
		return "Automation_build [name=" + name + ", duration=" + duration + ", status=" + status + ", hashed_id="
				+ hashed_id + "]";
	}

}
