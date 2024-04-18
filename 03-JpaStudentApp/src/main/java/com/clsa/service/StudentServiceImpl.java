package com.clsa.service;

import com.clsa.dao.StudentDao;
import com.clsa.dao.StudentDaoImpl;
import com.clsa.entity.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;
	
	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}
	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		Student result = dao.createStudent(student);
		dao.commitTransaction();
		return result;
	}
	@Override
	public Student findStudentById(int studentId) {
		return dao.readStudent(studentId);
	}
	@Override
	public Student modifyStudent(Student student) {
		dao.beginTransaction();
		Student result = dao.updateStudent(student);
		dao.commitTransaction();
		return result;
	}
	@Override
	public boolean removeStudent(int studentId) {
		dao.beginTransaction();
		boolean result = dao.deleteStudent(studentId);
		dao.commitTransaction();
		return result;
	}

}
