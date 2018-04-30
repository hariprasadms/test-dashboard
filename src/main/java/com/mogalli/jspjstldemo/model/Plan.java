package com.mogalli.jspjstldemo.model;

public class Plan {

	private String automate_plan;
	private int parallel_sessions_running;
	private int team_parallel_sessions_max_allowed;
	private int parallel_sessions_max_allowed;
	private String queued_sessions;
	private int queued_sessions_max_allowed;

	public String getAutomate_plan() {
		return automate_plan;
	}

	public void setAutomate_plan(String automate_plan) {
		this.automate_plan = automate_plan;
	}

	public int getParallel_sessions_running() {
		return parallel_sessions_running;
	}

	public void setParallel_sessions_running(int parallel_sessions_running) {
		this.parallel_sessions_running = parallel_sessions_running;
	}

	public int getTeam_parallel_sessions_max_allowed() {
		return team_parallel_sessions_max_allowed;
	}

	public void setTeam_parallel_sessions_max_allowed(int team_parallel_sessions_max_allowed) {
		this.team_parallel_sessions_max_allowed = team_parallel_sessions_max_allowed;
	}

	public int getParallel_sessions_max_allowed() {
		return parallel_sessions_max_allowed;
	}

	public void setParallel_sessions_max_allowed(int parallel_sessions_max_allowed) {
		this.parallel_sessions_max_allowed = parallel_sessions_max_allowed;
	}

	public String getQueued_sessions() {
		return queued_sessions;
	}

	public void setQueued_sessions(String queued_sessions) {
		this.queued_sessions = queued_sessions;
	}

	public int getQueued_sessions_max_allowed() {
		return queued_sessions_max_allowed;
	}

	public void setQueued_sessions_max_allowed(int queued_sessions_max_allowed) {
		this.queued_sessions_max_allowed = queued_sessions_max_allowed;
	}

	@Override
	public String toString() {
		return "browsersc [automate_plan=" + automate_plan + ", parallel_sessions_running=" + parallel_sessions_running
				+ ", team_parallel_sessions_max_allowed=" + team_parallel_sessions_max_allowed
				+ ", parallel_sessions_max_allowed=" + parallel_sessions_max_allowed + ", queued_sessions="
				+ queued_sessions + ", queued_sessions_max_allowed=" + queued_sessions_max_allowed + "]";
	}

}
