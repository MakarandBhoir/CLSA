package com.clsa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.clsa.entity.Student;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		Student student = new Student(); // New or Transient
		student.setStudentId(10);
		student.setStudentName("Test");
		student.setStudentScore(60);
		
		em.getTransaction().begin();
		em.persist(student); // Attached
		em.getTransaction().commit();
		System.out.println("Student is saved into database.");
		
		Student student2 = em.find(Student.class, 10); // Attached
		System.out.println(student2.getStudentId()+", "+student2.getStudentName()+", "+student2.getStudentScore());
		
		student2.setStudentName("Makarand");
		em.getTransaction().begin();
		em.merge(student2);
		em.getTransaction().commit();
		
		System.out.println("Student is updated.");
		
		em.getTransaction().begin();
		em.remove(student2);
		em.getTransaction().commit();
		
		System.out.println("Student is deleted from database.");
	}
}
