package org.cap.demo;

public class Customer {
	
	private int custID;
	
	private String name;
	private Address address;
	private Account[] account= new Account[4];
	private String mobile;
	private String email;
	
	public Customer(int custID, String name, Address address, Account[] account, String mobile, String email) {
		super();
		this.custID = custID;
		this.name = name;
		this.address = address;
		this.account = account;
		this.mobile = mobile;
		this.email = email;
	}
	
	public int getCustID() {
		return this.custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
