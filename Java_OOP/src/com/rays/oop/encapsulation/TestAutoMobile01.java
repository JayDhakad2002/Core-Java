package com.rays.oop.encapsulation;

public class TestAutoMobile01 {
	
	public static void main(String[] args) {
		
		AutoMobile car = new AutoMobile();
			
	    car.setColor("Red");
	    car.setSpeed(110);
	    car.setMake("Toyato");
	    
	    System.out.println(car.getColor());
	    System.out.println(car.getSpeed());
	    System.out.println(car.getMake());
	   
	}

}
