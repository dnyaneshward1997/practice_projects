package com.cdac.service;

import com.cdac.dao.StudentDao;

public class StudentService {

	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		System.out.println("setStudentDao() is called");
		this.studentDao = studentDao;
	}

	public void addStudent() {
		System.out.println("saveStudent() method is called");
		studentDao.saveStudent();
	}

}
