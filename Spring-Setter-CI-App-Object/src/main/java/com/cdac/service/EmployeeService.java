package com.cdac.service;

import com.cdac.dao.AddressDao;

public class EmployeeService {
	private int id;
	private String name;
	private AddressDao address;

	public EmployeeService(int id, String name, AddressDao address) {
		System.out.println("EmployeeService parameterized constructor called");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// setters and getters

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public AddressDao getAddress() {
		return address;
	}

	public void displayInfo() {
		System.out.println(name);
		System.out.println(address);
	}

}
