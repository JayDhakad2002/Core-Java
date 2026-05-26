package com.rays.oop.encapsulation;

public class TestAutoMobile {
	
	public static void main(String[] args) {
		
		AutoMobile car = new AutoMobile();
		
		car.setColor("Red");
		car.setSpeed(220);
		car.setMake("toyota");
		
		System.out.println(car.getColor());
		System.out.println(car.getSpeed());
		System.out.println(car.getMake());
		
		car.acclerator();
		
		System.out.println(car.getSpeed());
		
	}

}
