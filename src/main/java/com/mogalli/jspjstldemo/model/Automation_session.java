package com.mogalli.jspjstldemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Automation_session {
	
	public String name;
	public String public_url;
	public int duration;
	public String os;
	public String os_version;
	public String browser_version;
	public String browser;
	public Object device = null;
	public String status;
	public String hashed_id;
	public String reason;
	public String build_name;
	public String project_name;
	public String logs;
	public String browser_url;
	public String browser_console_logs_url;
	public String har_logs_url;
	public String video_url;
	
		
	public Automation_session() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublic_url() {
		return public_url;
	}

	public void setPublic_url(String public_url) {
		this.public_url = public_url;
	}
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOs_version() {
		return os_version;
	}

	public void setOs_version(String os_version) {
		this.os_version = os_version;
	}

	public String getBrowser_version() {
		return browser_version;
	}

	public void setBrowser_version(String browser_version) {
		this.browser_version = browser_version;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public Object getDevice() {
		return device;
	}

	public void setDevice(Object device) {
		this.device = device;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getBuild_name() {
		return build_name;
	}

	public void setBuild_name(String build_name) {
		this.build_name = build_name;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getLogs() {
		return logs;
	}

	public void setLogs(String logs) {
		this.logs = logs;
	}

	public String getBrowser_url() {
		return browser_url;
	}

	public void setBrowser_url(String browser_url) {
		this.browser_url = browser_url;
	}

	public String getBrowser_console_logs_url() {
		return browser_console_logs_url;
	}

	public void setBrowser_console_logs_url(String browser_console_logs_url) {
		this.browser_console_logs_url = browser_console_logs_url;
	}

	public String getHar_logs_url() {
		return har_logs_url;
	}

	public void setHar_logs_url(String har_logs_url) {
		this.har_logs_url = har_logs_url;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	@Override
	public String toString() {
		return "Automation_session [name=" + name + ", public_url=" + public_url + ", duration=" + duration + ", os="
				+ os + ", os_version=" + os_version + ", browser_version=" + browser_version + ", browser=" + browser
				+ ", device=" + device + ", status=" + status + ", hashed_id=" + hashed_id + ", reason=" + reason
				+ ", build_name=" + build_name + ", project_name=" + project_name + ", logs=" + logs + ", browser_url="
				+ browser_url + ", browser_console_logs_url=" + browser_console_logs_url + ", har_logs_url="
				+ har_logs_url + ", video_url=" + video_url + ", getName()=" + getName() + ", getPublic_url()="
				+ getPublic_url() + ", getDuration()=" + getDuration() + ", getOs()=" + getOs() + ", getOs_version()="
				+ getOs_version() + ", getBrowser_version()=" + getBrowser_version() + ", getBrowser()=" + getBrowser()
				+ ", getDevice()=" + getDevice() + ", getStatus()=" + getStatus() + ", getHashed_id()=" + getHashed_id()
				+ ", getReason()=" + getReason() + ", getBuild_name()=" + getBuild_name() + ", getProject_name()="
				+ getProject_name() + ", getLogs()=" + getLogs() + ", getBrowser_url()=" + getBrowser_url()
				+ ", getBrowser_console_logs_url()=" + getBrowser_console_logs_url() + ", getHar_logs_url()="
				+ getHar_logs_url() + ", getVideo_url()=" + getVideo_url() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
