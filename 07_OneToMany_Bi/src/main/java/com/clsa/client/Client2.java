package com.clsa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.clsa.entities.Department;

public class Client2 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
	
		// Find all department info by id
		int deptId = 101;
		//String jpql = "From Department"; // valid query to get all departments
		String jpql = "Select d From Department d where d.departmentId = :deptId";
		
		TypedQuery<Department> tquery = em.createQuery(jpql, Department.class);
		tquery.setParameter("deptId", deptId);
		Department dept = tquery.getSingleResult();
		if(dept != null)
			System.out.println(dept);
		else
			System.out.println("Department not found.");
		
		em.close();
		factory.close();
	}
}
