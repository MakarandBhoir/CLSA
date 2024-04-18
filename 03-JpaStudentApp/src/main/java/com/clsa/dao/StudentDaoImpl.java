package com.clsa.dao;

import javax.persistence.EntityManager;

import com.clsa.entity.Student;

public class StudentDaoImpl implements StudentDao{
	private EntityManager em;
	
	public StudentDaoImpl() {
		em = JpaUtils.getEntityManager();
	}
	
	@Override
	public Student createStudent(Student student) {
		em.persist(student);
		return student;
	}
	@Override
	public Student readStudent(int studentId) {
		Student result = em.find(Student.class, studentId);
		if(result == null) {
			throw new IllegalArgumentException(studentId+" not found in database.");
		}
		return result;
	}
	@Override
	public Student updateStudent(Student student) {
		return em.merge(student);
	}
	@Override
	public boolean deleteStudent(int studentId) {
		try {
			Student student = readStudent(studentId);
			em.remove(student);
		}catch(RuntimeException e) {
			return false;
		}
		return true;
	}
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
	}

}
