package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.TaskDao;
import com.sonata.Model.Task;



public class TaskDaoImpl implements TaskDao {
	
	int row=0;
	DBConnection db = new DBConnection();
	Task u=null;
	
	public int save(Object object) {
		try {
			u= (Task)object;
			PreparedStatement p=db.getConnection().prepareStatement("insert into task values(?,?,?,?,?,?,?,?,?,?,?)");
			p.setInt(1,u.getTaskid());
			p.setInt(2,u.getOwnerid());

			p.setInt(3,u.getCreatorid());

			p.setString(4,u.getTaskname());
			p.setString(5,u.getDescrptn());
			p.setString(6,u.getStatus());
			p.setString(7,u.getPriority());
			p.setString(8, u.getNotes());
			p.setBoolean(9, u.Isbookmrkd());
			p.setString(10, u.getCreated_on());
			p.setString(11, u.getStatchangeon());

			row=p.executeUpdate();
			db.closeConnection();
		}
		catch(Exception e) {System.out.println(e);}
		return row;
	}
	
	public List<Task> getData(){
		 List<Task> e1=new ArrayList<>();
		 try {
				PreparedStatement p1=db.getConnection().prepareStatement("select * from task");
				ResultSet rs=p1.executeQuery();
				while(rs.next()) {
					Task us = new Task();
					int taskid= rs.getInt(1);
					int ownerid= rs.getInt(2);
					int creatorid= rs.getInt(3);
					String taskname= rs.getString(4);
					String descrptn = rs.getString(5);
					String status = rs.getString(6);
					String priority = rs.getString(7);
					String notes = rs.getString(8);
					Boolean isbookmrkd = rs.getBoolean(9);
					String created_on = rs.getString(10);
					String statchangeon = rs.getString(11);


					us.setTaskid(taskid);
					us.setOwnerid(ownerid);
					us.setCreatorid(creatorid);
					us.setTaskname(taskname);
					us.setDescrptn(descrptn);
					us.setStatus(status);
					us.setPriority(priority);
					us.setNotes(notes);
					us.setIsbookmrkd(isbookmrkd);
					us.setCreated_on(created_on);
					us.setStatchangeon(statchangeon);

					
					e1.add(us);
				}
		 	}
			catch(Exception e) {System.out.println();}
		 	return e1;
	}
	public int update(Object object) {
		try {
			u = (Task)object;
			PreparedStatement p=db.getConnection().prepareStatement("update task set taskname=? where taskid=?");
			p.setString(1,"testing");
			p.setInt(2, u.getTaskid());
			row=p.executeUpdate();
			db.closeConnection();
		}
		catch(Exception e) {System.out.println();}
		return row;
	}
	
	public int delete(Object object) {
		try {
			u = (Task)object;
			PreparedStatement p=db.getConnection().prepareStatement("delete from task where taskid=?");
			p.setInt(1, u.getTaskid());
			row=p.executeUpdate();
			db.closeConnection();
		}
		catch(Exception e) {System.out.println();}
		return row;
	}
}


	


