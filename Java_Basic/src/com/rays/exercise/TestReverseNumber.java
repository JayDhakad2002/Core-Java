 package com.rays.exercise;

public class TestReverseNumber {

	public static void main(String[] args) {

		int number = 153;
		int r = 0;
		int rev = 0;
		int n = number; // n = 153

		while (n > 0) { // n = 153, n = 15, n = 1, n = 0 (false)
			r = n % 10; // r = 153 % 10 = 3, r = 15 % 10 = 5, r = 1 % 10 = 1
			rev = (rev * 10) + r; // rev = (0*10) + 3 = 3, rev = (3*10) + 5 = 351
			n = n / 10; // n = 153 / 10 = 15, n = 15 / 10 = 1, n = 1 / 10 = 0
		}
		
		System.out.println("Reverse Number = " + rev);
   }

}