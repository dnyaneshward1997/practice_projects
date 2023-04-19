package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");

		StudentService studentSevice = (StudentService) appCntx.getBean("studentService");
		studentSevice.addStudent();;

	}

}
