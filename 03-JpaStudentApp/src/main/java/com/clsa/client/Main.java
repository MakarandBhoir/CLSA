package com.clsa.client;

import com.clsa.entity.Student;
import com.clsa.service.StudentService;
import com.clsa.service.StudentServiceImpl;

public class Main {
	public static void main(String[] args) {
		Student student = new Student(); 
		student.setStudentId(10);
		student.setStudentName("Test");
		student.setStudentScore(60);
		
		StudentService service = new StudentServiceImpl();
		service.addStudent(student);
		System.out.println("Student data saved into database.");
	}
}
