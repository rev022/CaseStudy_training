package com.sonata.Model;

public class Task {
	
	private int taskid;
	private int ownerid;
	private int creatorid;

	private String taskname;
	private String descrptn;
	private String status;
	private String priority;
	private String notes;
	private boolean isbookmrkd;
	private String created_on;
	private String statchangeon;
	
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	
	public int getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(int ownerid) {
		this.ownerid = ownerid;
	}
	
	public int getCreatorid() {
		return creatorid;
	}
	public void setCreatorid(int creatorid) {
		this.creatorid = creatorid;
	}
	
	
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	
	public String getDescrptn() {
		return descrptn;
	}
	public void setDescrptn(String descrptn) {
		this.descrptn = descrptn;
	}
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	public boolean Isbookmrkd() {
		return isbookmrkd;
	}
	public void setIsbookmrkd(boolean isbookmrkd) {
		this.isbookmrkd = isbookmrkd;
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
		return "Task [taskid=" + taskid + ", ownerid=" + ownerid + ", creatorid=" + creatorid + ", taskname=" + taskname
				+ ", descrptn=" + descrptn + ", status=" + status + ", priority=" + priority + ", notes=" + notes
				+ ", isbookmrkd=" + isbookmrkd + ", created_on=" + created_on + ", statchangeon=" + statchangeon + "]";
	}
	
	
	
	
	
	
	
	
	
}



