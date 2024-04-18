package com.clsa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.clsa.entities.Address;
import com.clsa.entities.Student;

public class Client {

	public static void main(String[] args) {
		Student student = new Student(1, "Shagufta", 60);
		Address address = new Address(10, "Mumbai", "400001");
		student.setHomeAddress(address);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(address);
		em.persist(student);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}

}
