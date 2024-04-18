package com.clsa.dao;

import com.clsa.entity.Student;

public interface StudentDao {
	public Student createStudent(Student student);
	public Student readStudent(int studentId);
	public Student updateStudent(Student student);
	public boolean deleteStudent(int studentId);
	public void beginTransaction();
	public void commitTransaction();
}
