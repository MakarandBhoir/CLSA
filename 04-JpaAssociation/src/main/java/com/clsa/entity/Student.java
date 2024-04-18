package com.clsa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name = "students")
public class Student {
	@Id
	@Column(name = "student_id", length = 6)
	private int studentId;
	
	@Column(name = "student_name", length = 50, nullable = false)
	private String studentName;
	
	@Column(name = "student_score", length = 3, nullable = false)
	private double studentScore;
	
	//owner side
	@OneToOne
	//address_addressid
	@JoinColumn(name = "address_id")
	@Cascade(CascadeType.ALL)
	private Address address;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Department dept;
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
