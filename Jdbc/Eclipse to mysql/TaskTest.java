package com.sonata.Main;

import java.util.*;

import com.sonata.DaoImpl.TaskDaoImpl;
import com.sonata.Model.Task;


public class TaskTest {
	
	public static void main(String args[]) throws Exception{
		

		Task e = new Task();
		e.setTaskid(1778);
		e.setOwnerid(1778);
		e.setCreatorid(1778);

		e.setTaskname("devolping");
		e.setDescrptn("in java");
		e.setStatus("ongoing");
		e.setPriority("high");
		e.setNotes("to be done intime");
		e.setIsbookmrkd(true);
		e.setCreated_on("2021-11-11");
		e.setStatchangeon("2021-11-12");

		
		
		TaskDaoImpl d= new TaskDaoImpl();
		int row = d.save(e);
		System.out.println(row);
		
		List<Task> e1=new ArrayList<>();
		e1=d.getData();
		for(Task f:e1) {
			System.out.println(f.getTaskid()+" "+f.getOwnerid()+" "+f.getCreatorid()+" "+f.getTaskname()+" "+f.getDescrptn()+" "+f.getStatus()+" " +f.getPriority()+" "+f.getNotes()+" "+f.Isbookmrkd()+" "+f.getCreated_on()+f.getStatchangeon());
			System.out.println();
		}
		
		row=d.update(e);
		System.out.println(row);
		
		 row=d.delete(e);
		System.out.println(row);
		
		List<Task> e11=new ArrayList<>();
		e11=d.getData();
		for(Task f:e11) {
			System.out.println(f.getTaskid()+" "+f.getOwnerid()+" "+f.getCreatorid()+" "+f.getTaskname()+" "+f.getDescrptn()+" "+f.getStatus()+" " +f.getPriority()+" "+f.getNotes()+" "+f.Isbookmrkd()+" "+f.getCreated_on()+f.getStatchangeon());
			System.out.println();
		}
		
			
		}
		


	}
		
		


