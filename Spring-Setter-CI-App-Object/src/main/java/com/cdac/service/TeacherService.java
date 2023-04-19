package com.cdac.service;

import com.cdac.dao.TeacherDao;

public class TeacherService {

	private TeacherDao teacherDao;
	
	

	public TeacherService(TeacherDao teacherDao) {
		System.out.println("TeacherService parameterized constructor called");
		this.teacherDao = teacherDao;
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void addTeacher() {
		System.out.println("addTeacher() is called");
		teacherDao.saveTeacher();
	}
}
