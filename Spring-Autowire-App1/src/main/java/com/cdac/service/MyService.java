package com.cdac.service;

import com.cdac.dao.MyDao;

public class MyService {

	private MyDao myDao;


	public MyService(MyDao myDao) {
	
		this.myDao = myDao;
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		System.out.println("setMydao() is called");
		this.myDao = myDao;
	}

	public void add() {
		System.out.println("add() is called");
		myDao.save();
	}

}
