package com.clsa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client4 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		// update the score of student
		double updatedScore = 71;
		int studentId = 1;
		
		String jpql = "Update Student s Set s.studentScore = :updatedScore Where s.studentId = :id";
		
		em.getTransaction().begin();
		Query query = em.createQuery(jpql);
		query.setParameter("updatedScore", updatedScore);
		query.setParameter("id", studentId);
		int result = query.executeUpdate();
		em.getTransaction().commit();
		
		if(result >= 1)
			System.out.println("Student score is updated");
		else
			System.out.println("No student score is updated");
		
		em.close();
		factory.close();
	}
}
