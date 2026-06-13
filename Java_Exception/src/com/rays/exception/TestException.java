package com.rays.exception;

public class TestException {
	
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 15;
			int c = b/a;
			System.out.println("div" + c);
			
		}catch(ArithmeticException e) {
			System.out.println("exception" + e.getMessage());
			
  //       printStackTrace btata hai konsi line me exception aayi hai
		   e.printStackTrace();
		System.out.println("Program is finished");
		
		}
	}
	
}

