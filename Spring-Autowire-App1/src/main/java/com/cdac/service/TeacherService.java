package com.cdac.service;

import com.cdac.dao.TeacherDao;

public class TeacherService {

	private TeacherDao teacherDao;

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		System.out.println("setTeacherDao() is called");
		this.teacherDao = teacherDao;
	}

	public void addTeacher() {
		System.out.println("addTeacher() is called");
		teacherDao.saveTeacher();
	}
}
