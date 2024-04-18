package com.clsa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_TBL")
public class Address {
	@Id
	@Column(name="ADDRESS_ID")
	private int addressId;
	
	@Column(name="CITY", length=60)
	private String city;
	
	@Column(name="PINCODE", length=6)
	private String pincode;
	
	@OneToOne(mappedBy="homeAddress") // Address side is inverse
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Address(int addressId, String city, String pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.pincode = pincode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
