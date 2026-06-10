package com.rays.oop.polymorphism;

public class AxisBank extends Bank {
	
	@Override
	public String getName() {
		return "AxisBank";
	}
	
	@Override
	public double intersetRate() {
		return 11.25;
	}

}
