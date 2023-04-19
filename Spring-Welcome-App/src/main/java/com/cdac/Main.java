package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.model.MyBean;

public class Main {

	public static void main(String[] args) {

		// create IOC container
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");

		// get bean object from IOC Container
		MyBean mb = (MyBean) appCntx.getBean("myBean");

		System.out.println(mb.getMsg());

	}

}
