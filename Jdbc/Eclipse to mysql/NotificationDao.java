package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.Notification;


public interface NotificationDao {
	
	public int save(Object object);
	public List<Notification> getData();
	public int delete(Object object);
	public int update(Object object);


}
