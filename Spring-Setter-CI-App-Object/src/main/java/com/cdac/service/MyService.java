package com.cdac.service;

import com.cdac.dao.MyDao;

public class MyService {

	private MyDao myDao;

	public MyService(MyDao myDao) {
		System.out.println("Parameterized constructor called");
		this.myDao = myDao;
	}

	public MyDao getMyDao() {
		return myDao;
	}

	public void add() {
		System.out.println("add() is called");
		myDao.save();
	}

}
