package com.cdac.service;

import java.util.List;

import com.cdac.model.Employee;


public interface EmployeeService {
	
	public void add(Employee employee);

	public void modify(Employee employee);

	public void removeById(int id);

	public Employee getById(int id);

	public List<Employee> getAll();

	
}
