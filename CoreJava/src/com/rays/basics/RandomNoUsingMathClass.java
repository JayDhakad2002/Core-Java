package com.rays.basics;

public class RandomNoUsingMathClass {
	
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			int r = (int) (Math.random() * 100);

			System.out.println(r);
		}
	}

}
