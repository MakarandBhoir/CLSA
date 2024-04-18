package com.clsa.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.clsa.entities.Department;
import com.clsa.entities.Student;

public class Client3 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		double min=50, max=80;
		//String jpql = "Select s From Student s where s.studentScore Between :min and :max";
		String jpql = "Select s From Student s where s.studentScore >= :min and s.studentScore <= :max";
		
		TypedQuery<Student> tquery = em.createQuery(jpql, Student.class);
		tquery.setParameter("min", min);
		tquery.setParameter("max", max);
		
		List<Student> list = tquery.getResultList();
		
		list.stream().forEach(s -> System.out.println(s));
		
		em.close();
		factory.close();
	}
}
