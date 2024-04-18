package com.clsa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	private static EntityManagerFactory factory;
	
	public static EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory("Dev");
		return factory.createEntityManager();
	}
}
