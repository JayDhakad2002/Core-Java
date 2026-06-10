package com.rays.oop.polymorphism;

public class TestBankByArray {

	public static void main(String[] args) {

		Bank[] banks = new Bank[3]; // polymorphism by array

		banks[0] = new AxisBank(); // polymorphism by return type
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();

		homeLoanEnquiry(banks); // polymorphism by method argument

	}

	public static void homeLoanEnquiry(Bank[] banks) {
		for (int i = 0; i < banks.length; i++) {
			System.out.println(banks[i].getName());
			System.out.println(banks[i].intersetRate());
			System.out.println("------------------");
		}

	}

}
