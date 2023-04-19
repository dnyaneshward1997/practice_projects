package com.cdac.component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyCollection {

	private String myArr[];
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	private Properties myProperties;

	// getters and setters
	public String[] getMyArr() {
		return myArr;
	}

	public void setMyArr(String[] myArr) {
		System.out.println("setMyArr() called");
		this.myArr = myArr;
	}

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		System.out.println("setMyList() called");
		this.myList = myList;
	}

	public Set<String> getMySet() {
		return mySet;
	}

	public void setMySet(Set<String> mySet) {
		System.out.println("setMySet() called");
		this.mySet = mySet;
	}

	public Map<String, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, String> myMap) {
		System.out.println("setMyMap() called");
		this.myMap = myMap;
	}

	public Properties getMyProperties() {
		return myProperties;
	}

	public void setMyProperties(Properties myProperties) {
		System.out.println("setMyProperties() called");
		this.myProperties = myProperties;
	}

}
