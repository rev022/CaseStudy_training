package com.sonata.Main;

import java.util.*;

import com.sonata.DaoImpl.UserDaoImpl;
import com.sonata.Model.User;


public class UserTest {
	
public static void main(String args[]) throws Exception{
		

	User e = new User();
	e.setUserid(1778);
	e.setUsername("raj");
	e.setEmail("raj@gmail.com");
	e.setFname("raj");
	e.setLname("sharma");
	e.setPhno(9039383);
	e.setRole("HR");
	e.setIsactive(true);
	e.setDob("2021-11-12");
	e.setCreated_on("2021-11-11 12:23:45");
	
	
	UserDaoImpl d= new UserDaoImpl();
	int row = d.save(e);
	System.out.println(row);
	
	List<User> e1=new ArrayList<>();
	e1=d.getData();
	for(User f:e1) {
		System.out.println(f.getUserid()+" "+f.getUsername()+" "+f.getEmail()+" "+f.getFname()+" " +f.getLname()+" "+f.getPhno()+" "+f.getRole()+" "+f.isIsactive()+" "+f.getDob()+" "+f.getCreated_on());
		System.out.println();
	}
	
	row=d.update(e);
	System.out.println(row);
	
	 row=d.delete(e);
	System.out.println(row);
	
	List<User> e11=new ArrayList<>();
	e11=d.getData();
	for(User f:e11) {
		System.out.println(f.getUserid()+" "+f.getUsername()+" "+f.getEmail()+" "+f.getFname()+" " +f.getLname()+" "+f.getPhno()+" "+f.getRole()+" "+f.isIsactive()+" "+f.getDob()+" "+f.getCreated_on());
		System.out.println();
	}
	
		
	}
	


}
	
	
	


