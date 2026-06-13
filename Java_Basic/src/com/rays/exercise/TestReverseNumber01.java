package com.rays.exercise;

public class TestReverseNumber01 {

	public static void main(String[] args) {

		int number = 535;
		int r = 0;
		int rev = 0;
		int n = number; // n = 535

		while (n > 0) { // n = 535, n = 53, n = 5
			r = n % 10; // r = 5, r = 3, r = 5
			rev = (rev * 10) + r; // rev = 53, rev = 535
			n = n / 10; // n = 53, n = 5, n = 0
		}
		System.out.println("Reverse Number = " + rev);
	}
}