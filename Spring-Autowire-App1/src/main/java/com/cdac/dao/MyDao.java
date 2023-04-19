package com.cdac.dao;

public class MyDao {
	
	private MyDao myDao;

	
	public MyDao getMyDao() {
		return myDao;
	}


	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}


	public void save() {
		System.out.println("save() is called");
	}
}
