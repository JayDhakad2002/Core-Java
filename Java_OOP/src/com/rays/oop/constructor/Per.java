package com.rays.oop.constructor;

import java.util.Date;

public class Per {
	private String name;
	private String address;

	public Per(String n, String a) {
		this.name = n;
		this.address = a;
		System.out.println("Person is calling ");
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

}