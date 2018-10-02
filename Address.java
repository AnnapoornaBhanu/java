package org.cap.demo;

public class Address {

	private String street;
	private String add;
	private String city;
	private String state;
	private int pin;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
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
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Address(String street, String add, String city, String state, int pin) {
		super();
		this.street = street;
		this.add = add;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	
}
