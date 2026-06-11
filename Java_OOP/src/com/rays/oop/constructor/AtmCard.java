package com.rays.oop.constructor;

public class AtmCard {
	
	private String name;
	private int number;
	private int cvc;

	public AtmCard(String name, int number, int cvc) {
		this.name = name;
		this.number = number;
		this.cvc = cvc;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public int getCvc() {
		return cvc;
	}

}
