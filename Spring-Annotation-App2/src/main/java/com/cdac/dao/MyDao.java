package com.cdac.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao {

	public MyDao() {
		System.out.println("No argument MyDao is called ");
	}

	public void save() {
		System.out.println("save() called ");
	}

}
