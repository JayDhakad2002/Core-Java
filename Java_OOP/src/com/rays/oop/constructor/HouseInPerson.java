package com.rays.oop.constructor;

public class HouseInPerson {
	protected String name;
	protected String badroom;
	protected int kitchen;
	
	public HouseInPerson() {} ///default constructor //it is creat a person object and it's a requird methid and attribute;//
	
	public HouseInPerson(String name, String badroom, int kitchen) {
		this.name = name;
		this.badroom = badroom;
		this.kitchen = kitchen;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public String getBadroom() {
		return badroom;
		
	}
	
	public int getKitchen() {
		return kitchen;
		
	}

}
