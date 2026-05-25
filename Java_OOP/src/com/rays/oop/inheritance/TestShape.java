package com.rays.oop.inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
		System.out.println("----circle----");
		
		Circle c = new Circle();
		
		c.setRadius(2);
		c.setColor("Red");
		c.setBorderWidth(1);
		
		System.out.println("radius: " + c.getRadius()); //Child property
		System.out.println("color: " + c.getColor()); //Parent class property
		System.out.println("borderWidth: " + c.getBorderWidth()); //Parent class property
		c.area();
		
		System.out.println("----rectangle----");
		Rectangle r = new Rectangle();
		
		r.setLength(5);
		r.setWidth(10);
		r.setColor("Blue");
		r.setBorderWidth(3);
		
		System.out.println("length: " + r.getLength());
		System.out.println("width: " + r.getWidth());
		System.out.println("color: " + r.getColor());
		System.out.println("borderwidth: " + r.getBorderWidth());
		
		System.out.println("--------triangle--------");
		Triangle t = new Triangle();

		t.setBase(2);
		t.setHeight(2);
		t.setColor("green");
		t.setBorderWidth(1);

		System.out.println("base: " + t.getBase());
		System.out.println("hight: " + t.getHeight());
		System.out.println("color: " + t.getColor());
		System.out.println("borderWidth: " + t.getBorderWidth());
		t.area();
		
	}

}
