package com.rays.oop.constructor;

public class Railway {
	private String Passengername;
	private String Current;
	private String Destination;
	private int Seatno;
	
//	public Railway() {
//		System.out.println("default ");
//		it's not use in default constructor 
	
	public Railway(String p, String d, String c, int s) {
		this.Passengername = p;
		this.Current = c;
		this.Destination = d;
		this.Seatno = s;
		
	}
	
	public String getPassengername() {
		return Passengername;
		
	}
	
	public String getCurrent() {
		return Current;
		
	}
	
	public String getDestination() {
		return Destination;
		
	}
	
	public int getSeatno() {
		return Seatno;
		
	}

}
