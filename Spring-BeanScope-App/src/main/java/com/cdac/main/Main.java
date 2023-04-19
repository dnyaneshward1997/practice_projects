package com.cdac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.MyBean;

public class Main {

	public static void main(String[] args) {

		// ApplicationContext ==> IoC container
		ApplicationContext appCnxt = new ClassPathXmlApplicationContext("cfg.xml");
		MyBean mb = (MyBean) appCnxt.getBean("my");
		System.out.println(mb);
		
		MyBean mb1 = (MyBean) appCnxt.getBean("my");
		System.out.println(mb1);

	}

}
