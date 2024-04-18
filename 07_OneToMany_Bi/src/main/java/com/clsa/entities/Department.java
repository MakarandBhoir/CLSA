package com.clsa.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENT_TBL")
public class Department {
	@Id
	@Column(name="DEPARTMENT_ID")
	private int departmentId;
	
	@Column(name="DEPARTMENT_NAME", length=75, nullable=false, unique=true)
	private String departmentName;
	
	@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
	private Set<Student> students = new HashSet<>();
	
	public void addStudent(Student student) {
		student.setDepartment(this);
		students.add(student);
	}
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Department() {
		
	}
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
}
