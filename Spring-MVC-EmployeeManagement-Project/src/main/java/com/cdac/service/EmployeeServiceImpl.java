package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.EmployeeDao;
import com.cdac.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public void add(Employee employee) {
		employeeDao.save(employee);
	}

	@Override
	public void modify(Employee employee) {
		employeeDao.update(employee);
	}

	@Override
	public void removeById(int id) {
		employeeDao.deleteById(id);
	}

	@Override
	public Employee getById(int id) {
		return employeeDao.selectById(id);
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.selectAll();
	}

}