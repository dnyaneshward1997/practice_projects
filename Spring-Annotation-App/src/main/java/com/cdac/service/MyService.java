package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdac.dao.MyDao;

@Component
public class MyService {

	@Autowired
	private MyDao myDao;

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}

	public void add() {
		System.out.println("add() method called");
		myDao.save();
	}

}
