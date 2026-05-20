package com.rays.oop.encapsulation;

public class TestAutoMobile {
	
	public static void main(String[] args) {
		
		AutoMobile car = new AutoMobile();
		
		car.setColor("Red");
		car.setSpeed(90);
		car.setMake("toyota");
		
		System.out.println(car.getColor());
		System.out.println(car.getSpeed());
		System.out.println(car.getMake());
		
	}

}
