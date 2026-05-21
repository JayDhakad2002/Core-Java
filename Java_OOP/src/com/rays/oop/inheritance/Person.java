package com.rays.oop.inheritance;

import java.util.Date;

public class Person {
	
	protected String name;
	protected String address;
	protected Date dob;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String Address) {
		this.address = Address;
	}

	public Date getDate() {
		return dob;
	}
	
	public void setDate(Date dob) {
		this.dob =dob;
	}
	
}
