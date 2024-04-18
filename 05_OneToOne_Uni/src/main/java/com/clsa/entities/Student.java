package com.clsa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TBL")
public class Student {
	@Id
	@Column(name="STUDENT_ID")
	private int studentId;
	
	@Column(name="STUDENT_NAME", length=50, nullable=false)
	private String studentName;
	
	@Column(name="STUDENT_SCORE", length=3, nullable=false)
	private double studentScore;
	
	@OneToOne
	// Default FK - homeAddress_Address_Id
	// Owner entity. FK always create in owner entity
	@JoinColumn(name="Address_Id")
	private Address homeAddress;
	
	public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
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

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
}
