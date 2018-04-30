package com.mogalli.jspjstldemo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Projects {

	private int id;
	private String name;
	private String group_id;
	private String user_id;
	private String created_at;
	private String updated_at;
	private List<Automation_build> builds;

	
	
	public List<Automation_build> getBuilds() {
		return builds;
	}

	public void setBuilds(List<Automation_build> builds) {
		this.builds = builds;
	}

	public Projects() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "Projects [id=" + id + ", name=" + name + ", group_id=" + group_id + ", user_id=" + user_id
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + ", builds=" + builds + "]";
	}
	
	


}
