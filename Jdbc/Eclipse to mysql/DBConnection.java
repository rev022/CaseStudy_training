package com.sonata.DaoImpl;

import java.sql.*;

public class DBConnection {
	
	Connection connection;
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CaseStudyDB","root","admin@123");
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		return connection;
	}
		public void closeConnection() {
			
			try {
				 if(connection!=null) {
					 connection.close();
				 }
			} catch (SQLException sqle) {
				sqle.printStackTrace();
				}
		}
		
		
	}
	


