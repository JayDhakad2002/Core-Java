package com.rays.basics;

public class ReverseNumber {
	
	public static void main(String[] args) {

		int number = 153;
		int r = 0;
		int rev = 0;
		int n = number; 

		while (n > 0) {
			r = n % 10; 
			rev =(rev*10)+r;
			n=n/10; 
		}
		System.out.println("Reverse Number = " + rev);
   }
	
}
