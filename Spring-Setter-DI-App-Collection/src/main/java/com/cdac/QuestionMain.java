package com.cdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cdac.dao.QuestionDao;


public class QuestionMain {

	public static void main(String[] args) {
		ApplicationContext appCntx = new ClassPathXmlApplicationContext("cfg.xml");

		QuestionDao questionDao = (QuestionDao)appCntx.getBean("questionDao");  
		questionDao.displayInfo(); 
	}

}
