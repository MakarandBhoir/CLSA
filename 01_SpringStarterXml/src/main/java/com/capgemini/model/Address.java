package com.capgemini.model;

public class Address {
	private int addressId;
	private String city;
	private String state;
	private String pin;
	
	public Address() {
	}
	public Address(int addressId, String city, String state, String pin) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.pin = pin;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
}
