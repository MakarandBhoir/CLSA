package com.clsa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.clsa.entities.Address;
import com.clsa.entities.Department;
import com.clsa.entities.Student;

public class Client {

	public static void main(String[] args) {
		Student student1 = new Student(3, "Vaibhav", 60);
		Address address1 = new Address(30, "Nasik", "400001");
		student1.setHomeAddress(address1);
		address1.setStudent(student1);
		
		Student student2 = new Student(4, "Alsabaha", 60);
		Address address2 = new Address(40, "Thane", "500500");
		student2.setHomeAddress(address2);
		address2.setStudent(student2);
		
		Department dept1 = new Department(101, "Mechanical");
		dept1.addStudent(student1);
		dept1.addStudent(student2);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(dept1);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}

}
