package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.User;


public interface UserDao {
	
	public int save(Object object);
	public List<User> getData();
	public int delete(Object object);
	public int update(Object object);

}
