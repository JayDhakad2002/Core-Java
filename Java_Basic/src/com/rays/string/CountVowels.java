package com.rays.string;

public class CountVowels {

	public static void main(String[] args) {

		String str = "google";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
			if (str.charAt(i) == 'e') {
				count++;
			}
			if (str.charAt(i) == 'i') {
				count++;
			}
			if (str.charAt(i) == 'o') {
				count++;
			}
			if (str.charAt(i) == 'u') {
				count++;
			}

		}
		System.out.println(count);

	}

}
