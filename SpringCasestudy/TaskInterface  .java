package com.sonata.Rest;

import java.util.List;


public interface TaskInterface {
	//public Task getTask(int id);
	public List<Task> getData();
	public int setPriority(int taskid, String pri);
	public List<Task> printTask(int t);
	public int addtask(Task u);
	public int addNotes(String notes,  int taskid);
	public int addBM(String isBookMarked, int taskid);
	public int assignTask(int taskid, int ownerid);
	public List<Task> SearchTask(int t);
	public List<Task> TrackTask(String s);



	
}
