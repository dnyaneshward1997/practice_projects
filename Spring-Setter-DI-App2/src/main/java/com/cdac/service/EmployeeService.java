package com.cdac.service;

import com.cdac.dao.AddressDao;

public class EmployeeService {
	private int id;
	private String name;
	private AddressDao address;

	// setters and getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressDao getAddress() {
		return address;
	}

	public void setAddress(AddressDao address) {
		this.address = address;
	}

	public void displayInfo() {
		System.out.println(name);
		System.out.println(address);
	}

}
