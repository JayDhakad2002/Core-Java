package com.rays.oop.encapsulation;

import java.util.Date;

public class Person {
	
	private String name;
	private Date dob;
	private String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Date getdob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddresss(String address) {
		this.address = address;
	}
	
}
