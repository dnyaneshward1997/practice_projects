package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.MyBeans;


public class Main { 

	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");

		MyBeans mb = (MyBeans) appCntx.getBean("myBean");
		System.out.println(mb.getMsgId());
		System.out.println(mb.getMsg());
		
		MyBeans mb1 = (MyBeans) appCntx.getBean("myBean1");
		System.out.println(mb1.getMsgId());
		System.out.println(mb1.getMsg());
	}

}
