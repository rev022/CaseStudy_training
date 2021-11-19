package com.sonata.Main;

import java.util.ArrayList;
import java.util.List;

import com.sonata.DaoImpl.NotificationDaoImpl;
import com.sonata.Model.Notification;



public class NotificationTest {
	
	
public static void main(String args[]) throws Exception{
		

		Notification e = new Notification();
		e.setNotifid(18);

		e.setTaskid(1778);
		e.setTask_own_id(1778);

		
		e.setStatus("ongoing");
		
		e.setCreated_on("2021-11-11");
		e.setStatchangeon("2021-11-12");

		
		
		NotificationDaoImpl d= new NotificationDaoImpl();
		int row = d.save(e);
		System.out.println(row);
		
		List<Notification> e1=new ArrayList<>();
		e1=d.getData();
		for(Notification f:e1) {
			System.out.println(f.getNotifid()+" "+f.getTaskid()+" "+f.getTask_own_id()+" "+f.getStatus()+" "+f.getCreated_on()+f.getStatchangeon());
			System.out.println();
		}
		
		row=d.update(e);
		System.out.println(row);
		
		 row=d.delete(e);
		System.out.println(row);
		
		List<Notification> e11=new ArrayList<>();
		e11=d.getData();
		for(Notification f:e11) {
			System.out.println(f.getNotifid()+" "+f.getTaskid()+" "+f.getTask_own_id()+" "+f.getStatus()+" "+f.getCreated_on()+f.getStatchangeon());
			System.out.println();
		}
		
			
		}
		


}
