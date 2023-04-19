package com.cdac.service;

import com.cdac.dao.StudentDao;

public class StudentService {

	private StudentDao studentDao;

	public StudentService(StudentDao studentDao) {
		System.out.println("StudentService parameterized constructor called");
		this.studentDao = studentDao;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void addStudent() {
		System.out.println("addStudent() method is called");
		studentDao.saveStudent();
	}

}
