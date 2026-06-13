package com.rays.basics;

public class CalculatorUsingSwitchCase {
	
	public static void main(String[] args) {

		int a = 10;
		int b = 15;
		
		String  opr = "+";
		switch (opr) {
		case "+":
			System.out.println("Result: " + (a+b));
			break;
		case "-":
			System.out.println("Result: " + (a-b));
			break;
		case "*":
			System.out.println("Result: " + (a*b));
			break;
		case "/":
			System.out.println("Result: " + (a/b));
			break;
		case "%":
			System.out.println("Result: " + (a%b));
			break;

		default:
			break;
		}
	}

}


