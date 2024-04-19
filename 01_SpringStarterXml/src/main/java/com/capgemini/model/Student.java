package com.capgemini.model;

public class Student {
	private int studentId;
	private String studentName;
	private double studentScore;
	
	// tight-coupling
	// private Address address = new Address();
		
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	// Setter injection
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Student() {
		System.out.println("Student object is created.");
	}
	public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
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
	
	public void destroy() {
		System.out.println("destroy method");
	}
	
}
