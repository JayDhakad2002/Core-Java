package com.rays.oop.inheritance;

public class TestRectangle {
	public static void main(String[] args) {
		
	
	Rectangle R = new Rectangle();
	R.setColor("Yellow");
	R.setBorderWidth(5);
	R.setLength(5);
	R.setWidth(5);
	
	System.out.println("Color:- " + R.getColor());
	System.out.println("BorderWidth:- " + R.getBorderWidth());
	System.out.println("Length:- " + R.getLength());
	System.out.println("Width:- " + R.getWidth());
	System.out.println("Area:- " + R.area());
	}

}