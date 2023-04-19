package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.MyCollection;
import com.cdac.component.Teacher;

public class Main {

	public static void main(String[] args) {

		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");

		MyCollection myCollection = (MyCollection) appCntx.getBean("collection");

		for (String s : myCollection.getMyArr()) {
			System.out.println(s);
		}
		System.out.println("-------------------------------");
		System.out.println(myCollection.getMyList());
		System.out.println("-------------------------------");
		System.out.println(myCollection.getMySet());
		System.out.println("-------------------------------");
		System.out.println(myCollection.getMyMap());
		System.out.println("-------------------------------");
		System.out.println(myCollection.getMyProperties());
		System.out.println("-------------------------------");

	}

}
