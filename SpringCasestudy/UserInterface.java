package com.sonata.Rest;

import java.sql.SQLException;

public interface UserInterface {
	
	public int insert(User u);
	public boolean login(String u, String p) throws SQLException;


}
