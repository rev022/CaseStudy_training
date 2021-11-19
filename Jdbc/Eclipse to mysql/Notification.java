package com.sonata.Model;

public class Notification {
	

	private int notifid;
	private int taskid;
	private int task_own_id;
	private String status;
	private String created_on;
	private String statchangeon;
	
	
	
	
	public int getNotifid() {
		return notifid;
	}
	public void setNotifid(int notifid) {
		this.notifid = notifid;
	}
	
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	
	public int getTask_own_id() {
		return taskid;
	}
	public void setTask_own_id(int task_own_id) {
		this.task_own_id = task_own_id;
	}

	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	
	public String getStatchangeon() {
		return statchangeon;
	}
	public void setStatchangeon(String statchangeon) {
		this.statchangeon = statchangeon;
	}
	@Override
	public String toString() {
		return "Notification [notifid=" + notifid + ", taskid=" + taskid + ", task_own_id=" + task_own_id + ", status="
				+ status + ", created_on=" + created_on + ", statchangeon=" + statchangeon + "]";
	}
	
	
	
	
	
	
	

}
