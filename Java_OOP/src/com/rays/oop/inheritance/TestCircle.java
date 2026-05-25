package com.rays.oop.inheritance;

public class TestCircle {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(5);
		c.setBorderWidth(2);
		c.setColor("Blue");
		
		System.out.println("Radius:- " + c.getRadius());
		System.out.println("BorderWidth:- " + c.getBorderWidth());
		System.out.println("Color:- " + c.getColor());
		System.out.println(c.area());
	
	}

}
