package com.rays.oop.overridding;

public class HDFCBank extends Bank{
	
	@Override
	public String getName() {
		return "HDFCBank";
	}
	
	@Override
	public double interestRate() {
		return 10.10;
	}

}
