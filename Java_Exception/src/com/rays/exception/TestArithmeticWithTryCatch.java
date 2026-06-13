package com.rays.exception;

public class TestArithmeticWithTryCatch {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		try {
			int c = a/b; //ArithmeticException
			System.out.println("c:" + c);
		}catch(ArithmeticException e) {
			System.out.println("exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Program Is Finish");
		
	}

}
