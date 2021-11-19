package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.NotificationDao;
import com.sonata.Model.Notification;



	
	
	public class NotificationDaoImpl implements NotificationDao {
		
		int row=0;
		DBConnection db = new DBConnection();
		Notification u=null;
		
		public int save(Object object) {
			try {
				u= (Notification)object;
				PreparedStatement p=db.getConnection().prepareStatement("insert into notification values(?,?,?,?,?,?)");
				p.setInt(1,u.getNotifid());
				p.setInt(2,u.getTaskid());

				p.setInt(3,u.getTask_own_id());

				
				p.setString(4,u.getStatus());
	
				p.setString(5, u.getCreated_on());
				p.setString(6, u.getStatchangeon());

				row=p.executeUpdate();
				db.closeConnection();
			}
			catch(Exception e) {System.out.println(e);}
			return row;
		}
		
		public List<Notification> getData(){
			 List<Notification> e1=new ArrayList<>();
			 try {
					PreparedStatement p1=db.getConnection().prepareStatement("select * from notification");
					ResultSet rs=p1.executeQuery();
					while(rs.next()) {
						Notification us = new Notification();
						int notifid= rs.getInt(1);

						int taskid= rs.getInt(2);
						int task_own_id= rs.getInt(3);
						String status = rs.getString(4);
						String created_on = rs.getString(5);
						String statchangeon = rs.getString(6);

						us.setNotifid(notifid);

						us.setTaskid(taskid);
						us.setTask_own_id(task_own_id);
						
						us.setStatus(status);
						
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
				u = (Notification)object;
				PreparedStatement p=db.getConnection().prepareStatement("update notification set taskid=? where notifid=?");
				p.setInt(1,10);
				p.setInt(2, u.getTaskid());
				row=p.executeUpdate();
				db.closeConnection();
			}
			catch(Exception e) {System.out.println();}
			return row;
		}
		
		public int delete(Object object) {
			try {
				u = (Notification)object;
				PreparedStatement p=db.getConnection().prepareStatement("delete from notification where taskid=?");
				p.setInt(1, u.getTaskid());
				row=p.executeUpdate();
				db.closeConnection();
			}
			catch(Exception e) {System.out.println();}
			return row;
		}

}
