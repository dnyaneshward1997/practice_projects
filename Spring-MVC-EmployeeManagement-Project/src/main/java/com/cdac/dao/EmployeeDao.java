package com.cdac.dao;

import java.util.List;
import com.cdac.model.Employee;


public interface EmployeeDao {
	
	public void save(Employee employee);

	public void update(Employee employee);

	public void deleteById(int id);

	public Employee selectById(int id);

	public List<Employee> selectAll();


}
