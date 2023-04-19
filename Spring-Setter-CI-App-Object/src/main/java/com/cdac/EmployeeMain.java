package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cdac.service.EmployeeService;

public class EmployeeMain {
	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
		EmployeeService employeeService = (EmployeeService) appCntx.getBean("employeeService");
		employeeService.displayInfo();
	}
}
