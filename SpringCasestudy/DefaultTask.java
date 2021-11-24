package com.sonata.Rest.Impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sonata.Rest.TaskInterface;
import com.example.demo.dbConnection;
import com.sonata.Rest.Task;

@Component
public class DefaultTask implements TaskInterface {
	dbConnection db = new dbConnection();
	int row=0;
	Task u=null;


	/*@Override
	public Task getTask(int id) {
		Task t  = new Task();
		//conntec the db, get the task with id 
		t.setTaskid(100);
		t.setTaskname("REST Controller");
		t.setDesc("Write a rest contrller for getting tasks");
		return t;
	} */

	@Override
	public List<Task> getData() {
		
		List<Task> e1=new ArrayList<>();
		 try {
				PreparedStatement p1=db.getCon().prepareStatement("select * from task");
				ResultSet rs=p1.executeQuery();
				while(rs.next()) {
					Task us = new Task();
					int taskid= rs.getInt(1);
					int ownerid=rs.getInt(2);
					int creatorid=rs.getInt(3);
					String name= rs.getString(4);
					String descrptn = rs.getString(5);
					String status = rs.getString(6);
					String priority = rs.getString(7);
					String notes = rs.getString(8);
					Boolean isBookMarked = rs.getBoolean(9);
					String created_on = rs.getString(10);
					String status_changed_on = rs.getString(11);


					us.setTaskid(taskid);
					us.setOwnerid(ownerid);
					us.setCreatorid(creatorid);
					us.setName(name);
					us.setDescrptn(descrptn);
					us.setStatus(status);
					us.setPriority(priority);
					us.setNotes(notes);
					us.setBookMarked(isBookMarked);
					us.setCreated_on(created_on);
					us.setStatus_changed_on(status_changed_on);

					
					e1.add(us);
				}
		 	}
			catch(Exception e) {System.out.println();}
		 	return e1;
	}

	public List<Task> printTask(int t){
		dbConnection db = new dbConnection();
		List<Task> e1=new ArrayList<>();
		 try {
				PreparedStatement p1=db.getCon().prepareStatement("select * from task where taskid=?");
				p1.setInt(1, t);
				ResultSet rs=p1.executeQuery();
				while(rs.next()) {
					Task us = new Task();
					int taskid= rs.getInt(1);
					int ownerid=rs.getInt(2);
					int creatorid=rs.getInt(3);
					String name= rs.getString(4);
					String descrptn = rs.getString(5);
					String status = rs.getString(6);
					String priority = rs.getString(7);
					String notes = rs.getString(8);
					Boolean isbm = rs.getBoolean(9);
					String sco = rs.getString(11);
					String createdon = rs.getString(10);

					us.setTaskid(taskid);
					us.setOwnerid(ownerid);
					us.setCreatorid(creatorid);
					us.setName(name);
					us.setDescrptn(descrptn);
					us.setStatus(status);
					us.setPriority(priority);
					us.setNotes(notes);
					us.setBookMarked(isbm);
					us.setStatus_changed_on(sco);
					us.setCreated_on(createdon);
					
					e1.add(us);
				}
		 	}
			catch(Exception e) {System.out.println();}
		 	return e1;
	}
	public int setPriority(int taskid, String pri) {
		int row=0;
		try {
			dbConnection db = new dbConnection();
			PreparedStatement p=db.getCon().prepareStatement("update task set priority=? where taskid=?");
			p.setInt(2, taskid);
			p.setString(1, pri);
			row=p.executeUpdate();
			db.closeCon();
		}
		catch(Exception e) {System.out.println();}
		return row;
	}

	@Override
	public int addtask(Task u) {

		
		try {
			PreparedStatement p=db.getCon().prepareStatement("insert into task values(?,?,?,?,?,?,?,?,?,?,?)");
			p.setInt(1,u.getTaskid());
			p.setInt(2,u.getOwnerid());
			p.setInt(3,u.getCreatorid());
			p.setString(4,u.getName());
			p.setString(5,u.getDescrptn());
			p.setString(6,u.getStatus());
			p.setString(7,u.getPriority());
			p.setString(8,u.getNotes());
			p.setBoolean(9, u.isBookMarked());
			p.setString(10, u.getStatus_changed_on());
			p.setString(11, u.getCreated_on());

			return p.executeUpdate();
			
	
}
catch(Exception e) {System.out.println(e);}
		return 0;
}

	@Override
	public int addNotes(String notes , int taskid) {
		
		try {
			dbConnection db = new dbConnection();
			
			PreparedStatement p=db.getCon().prepareStatement("update task set notes=?  where taskid=?");
			p.setString(1, notes);
		
			p.setInt(2, taskid);

			row=p.executeUpdate();
			db.closeCon();
		}
		catch(Exception e) {System.out.println();}
		return row;
	}
	
	@Override
	public int addBM(String isBookMarked , int taskid) {
		
		try {
			dbConnection db = new dbConnection();
			
			PreparedStatement p=db.getCon().prepareStatement("update task set isBookMarked=? where taskid=?");
			boolean bool = Boolean.parseBoolean(isBookMarked);
			p.setBoolean(1, bool);
			p.setInt(2, taskid);

			row=p.executeUpdate();
			db.closeCon();
		}
		catch(Exception e) {System.out.println();}
		return row;
	}

	@Override
	public int assignTask(int taskid, int ownerid) {
		try {
			dbConnection db = new dbConnection();
			
			PreparedStatement p=db.getCon().prepareStatement("update task set ownerid=? where taskid=?");
			p.setInt(1, ownerid);

			p.setInt(2, taskid);

			row=p.executeUpdate();
			db.closeCon();
		}
		catch(Exception e) {System.out.println();}
		return row;
	}

	@Override
	public List<Task> SearchTask(int t) {

		
	dbConnection db = new dbConnection();
	List<Task> e1=new ArrayList<>();
	 try {
			PreparedStatement p1=db.getCon().prepareStatement("select * from task where taskid=?");
			p1.setInt(1, t);
			ResultSet rs=p1.executeQuery();
			while(rs.next()) {
				Task us = new Task();
				int taskid= rs.getInt(1);
				int ownerid=rs.getInt(2);
				int creatorid=rs.getInt(3);
				String name= rs.getString(4);
				String descrptn = rs.getString(5);
				String status = rs.getString(6);
				String priority = rs.getString(7);
				String notes = rs.getString(8);
				Boolean isbm = rs.getBoolean(9);
				String sco = rs.getString(11);
				String createdon = rs.getString(10);

				us.setTaskid(taskid);
				us.setOwnerid(ownerid);
				us.setCreatorid(creatorid);
				us.setName(name);
				us.setDescrptn(descrptn);
				us.setStatus(status);
				us.setPriority(priority);
				us.setNotes(notes);
				us.setBookMarked(isbm);
				us.setStatus_changed_on(sco);
				us.setCreated_on(createdon);
				
				e1.add(us);
			}
	 	}
		catch(Exception e) {System.out.println();}
	 	return e1;
}

	@Override
	public List<Task> TrackTask(String s) {
		
		List<Task> e1=new ArrayList<>();
		 try {
				PreparedStatement p1=db.getCon().prepareStatement("select * from task where status=?");
				
				p1.setString(1, s);
				ResultSet rs=p1.executeQuery();
				while(rs.next()) {
					Task us = new Task();
					int taskid= rs.getInt(1);
					int ownerid=rs.getInt(2);
					int creatorid=rs.getInt(3);
					String name= rs.getString(4);
					String descrptn = rs.getString(5);
					String status = rs.getString(6);
					String priority = rs.getString(7);
					String notes = rs.getString(8);
					Boolean isBookMarked = rs.getBoolean(9);
					String created_on = rs.getString(10);
					String status_changed_on = rs.getString(11);


					us.setTaskid(taskid);
					us.setOwnerid(ownerid);
					us.setCreatorid(creatorid);
					us.setName(name);
					us.setDescrptn(descrptn);
					us.setStatus(status);
					us.setPriority(priority);
					us.setNotes(notes);
					us.setBookMarked(isBookMarked);
					us.setCreated_on(created_on);
					us.setStatus_changed_on(status_changed_on);

					
					e1.add(us);
				}
		 	}
			catch(Exception e) {System.out.println();}
		 	return e1;
	}

		
		
		
	}
	
	
	
	
	
	
		
	
		
		
		
		
	



		
		
		
		
	

	


		
		
	

	


