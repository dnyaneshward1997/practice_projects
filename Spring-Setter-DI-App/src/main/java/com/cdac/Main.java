package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.MyBean;
import com.cdac.component.Teacher;

public class Main {

	public static void main(String[] args) {
		
	ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");
	
	MyBean mb = (MyBean) appCntx.getBean("my");
	Teacher teacher = (Teacher)appCntx.getBean("teacher");
	
	System.out.println(mb.getMsgId());
	System.out.println(mb.getMsg());
	
	System.out.println(teacher.getId());
	System.out.println(teacher.getTeacher_name());

	}

}
