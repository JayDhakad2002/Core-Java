package com.rays.basics;

import java.util.Scanner;

public class TestCalculatorCansol {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
	System.out.println("Enter First Number:");
	int a = sc.nextInt();
	
	System.out.println("Enter Second Number:");
	int b = sc.nextInt();
	
	System.out.println("Enter Any One Opertaion:");
	String opr = sc.next();
	
		switch (opr) {
		case"+":
			System.out.println("result: "+(a+b));
			break;
		case"-":
			System.out.println("result: "+(a-b));
			break;
		case"*":
			System.out.println("result: "+(a*b));
			break;
		case"/":
			System.out.println("result: "+(a/b));
			break;
		case"%":
			System.out.println("result: "+(a%b));
			break;
			
		}
	}
}
