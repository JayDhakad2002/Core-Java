package com.rays.exercise;

public class TestArmStrongNumber {

	public static void main(String[] args) {

		int number = 153;
		int r = 0;
		int sum = 0;
		int n = number; // n = 153

		while (n > 0) { // n = 153, n = 15, n = 1, n = 0 (false)
			r = n % 10; // r = 153 % 10 = 3, r = 15 % 10 = 5, r = 1 % 10 = 1
			sum = sum + (r * r * r); // sum = 0 + (3*3*3) = 27, sum = 27 + (5*5*5) = 152, sum = 152 + (1*1*1) = 153
			n = n / 10; // n = 153 / 10 = 15, n = 15 / 10 = 1, n = 1 / 10 = 0
		}

		if (sum == number) {
			System.out.println("Armstrong Number = " + number);
		} else {
			System.out.println("Armstrong Number");
		}

	}
} 
