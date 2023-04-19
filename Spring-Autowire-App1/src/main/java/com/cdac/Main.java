package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.service.MyService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");

		MyService myService = (MyService) appCntx.getBean("service");
		myService.add();
	}

}
