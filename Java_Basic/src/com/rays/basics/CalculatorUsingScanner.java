package com.rays.basics;

import java.util.Scanner;

public class CalculatorUsingScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		System.out.println("Enter operators like +, -, *, /, %");
		String opr = sc.next();

		switch (opr) {
		case "+":
			System.out.println("Result: " + (a + b));

			break;
		case "-":
			System.out.println("Result: " + (a - b));

			break;
		case "/":
			System.out.println("Result: " + (a / b));

			break;
		case "*":
			System.out.println("Result: " + (a * b));

			break;
		case "%":
			System.out.println("Result: " + (a % b));

			break;

		default:
			break;
		}

	}

}
	
	


