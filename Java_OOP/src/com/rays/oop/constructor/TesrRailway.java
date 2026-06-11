package com.rays.oop.constructor;

public class TesrRailway {
public static void main(String[] args) {
		
		Railway r = new Railway("Ritik", "bhopal","indore",45);
		
		System.out.println("..............................................");
		System.out.println("Railway all details in a station : -");
		System.out.println(" ");
		System.out.println("Passengername 1 : " + r.getPassengername());
		System.out.println("Destination 2 : " + r.getDestination());
		System.out.println("current 3 : " + r.getCurrent());
		System.out.println("Seatno 4 : " + r.getSeatno());
		System.out.println(" ");
		
		System.out.println("..............................................");
		
//		System.out.println("default");
		
		
	}


}
