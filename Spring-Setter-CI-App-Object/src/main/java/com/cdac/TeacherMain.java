package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.service.TeacherService;

public class TeacherMain {
	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");

		TeacherService teacherService = (TeacherService) appCntx.getBean("teacherService");
		teacherService.addTeacher();
	}
}
