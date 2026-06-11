package com.rays.oop.abstraction;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s = new Circle();
		
		Circle c = (Circle) s;
		
		c.setRadius(5);
		
		Shape s1 = new Rectangle();
		
		Rectangle r = (Rectangle) s1;
		
		r.setLength(8);
		r.setWidth(5);
		
		Shape s2 = new Triangle();
		
		Triangle t = (Triangle) s2;
		
		t.setBase(4);
		t.setHeight(2);
		
		System.out.println(s.area() + "\n" + s1.area() + "\n" + s2.area());
		
	}
	
}
