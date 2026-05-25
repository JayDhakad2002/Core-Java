package com.rays.oop.encapsulation;

public class Sum {
	
//	METHOD OVERLOADING

	public void sum(int i, int j) {
		System.out.println("Sum of two no: " + (i+j));
	}
	public void sum(int i, int j, int k) {
		System.out.println("Sum of two no: " + (i+j+k));
	}
	public void sum(double a, double b) {
		System.out.println("Sum of two double no: " + (a+b));
	}

}
