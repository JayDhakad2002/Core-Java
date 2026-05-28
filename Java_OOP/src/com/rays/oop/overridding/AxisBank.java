package com.rays.oop.overridding;

public class AxisBank extends Bank{
	
	@Override
	public String getName() {
		return "Axis Bank";
	}
	
	@Override
	public double interestRate() {
		return 11.25;
	}

}
