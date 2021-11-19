package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.Task;


public interface TaskDao {
	

	public int save(Object object);
	public List<Task> getData();
	public int delete(Object object);
	public int update(Object object);


}
