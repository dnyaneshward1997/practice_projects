package com.cdac.dao;

public class AddressDao {
	private String addressLine1;
	private String city;
	private String state;
	private String country;

	
	public AddressDao(String addressLine1, String city, String state, String country) {
		System.out.println("AddressDao parameterized constructor called");
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	// getters and setters

	public String getAddressLine1() {
		return addressLine1;
	}


	public String getCity() {
		return city;
	}

	
	public String getState() {
		return state;
	}

	
	public String getCountry() {
		return country;
	}


	@Override
	public String toString() {
		return addressLine1 + " " + city + " " + state + " " + country;
	}
	
	
}
