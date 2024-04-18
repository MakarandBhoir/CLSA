package com.clsa.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.clsa.entity.Address;
import com.clsa.entity.Department;
import com.clsa.entity.Student;


public class Client {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(10);
		student.setStudentName("Test");
		student.setStudentScore(60);
		
		Student student2 = new Student();
		student2.setStudentId(11);
		student2.setStudentName("Test2");
		student2.setStudentScore(45);
		
		Address address = new Address();
		address.setAddressId(1000);
		address.setCity("Pune");
		address.setState("MH");
		
		Address address2 = new Address();
		address2.setAddressId(1002);
		address2.setCity("Mumbai");
		address2.setState("MH");
		
		Department department = new Department();
		department.setDeptId(1);
		department.setDeptName("IT");
		
		List<Student> students = new ArrayList<>();
		students.add(student);
		students.add(student2);
		
		department.setStudents(students);
		student.setDept(department);
		student2.setDept(department);
		
		student.setAddress(address);
		student2.setAddress(address2);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		//em.persist(student);
		//em.persist(student2);
		em.persist(department);
		em.getTransaction().commit();
		
	}

}






