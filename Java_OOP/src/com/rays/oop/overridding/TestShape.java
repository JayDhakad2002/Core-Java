package com.rays.oop.overridding;

public class TestShape {
	
	public static void main(String[] args) {
		
	   Circle c = new Circle();
	   
	   c.setColor("Red");
	   c.setBorderWidth(2);
	   c.setRadius(2);
	   
	   System.out.println("color: " + c.getColor());
	   System.out.println("border width: " + c.getBorderWidth());
	   System.out.println("radius: " + c.getRadius());
	   c.area();
		
	}

}
