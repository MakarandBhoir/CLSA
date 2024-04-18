package com.clsa.service;

import com.clsa.entity.Student;

public interface StudentService {
	public Student addStudent(Student student);
	public Student findStudentById(int studentId);
	public Student modifyStudent(Student student);
	public boolean removeStudent(int studentId);
}
