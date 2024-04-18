package com.clsa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(10);
		student.setStudentName("Test");
		student.setStudentScore(60);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
	}
}
