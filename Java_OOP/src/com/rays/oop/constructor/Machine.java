package com.rays.oop.constructor;

public class Machine extends AtmCard{
	private int balance;

	public Machine(String name, int number, int cvc, int b) {
		super(name, number, cvc);
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

}
