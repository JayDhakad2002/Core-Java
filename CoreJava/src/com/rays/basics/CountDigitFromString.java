package com.rays.basics;

public class CountDigitFromString {
	
	public static void main(String[] args) {

		String digit = "ac5d4b2f6";
		int count = 0;
		for (int i = 0; i < digit.length(); i++) {
			if (Character.isDigit(digit.charAt(i))) {
				System.out.println(digit.charAt(i));
				count++;

			}
		}

		System.out.println("total digit is : " + count);

	}
}

