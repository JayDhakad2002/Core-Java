package com.rays.string01;

public class ConvertPrimitiveDataIntoString {
	
	public static void main(String[]args) {

		String btStr = String.valueOf(1);        // "1"
		String shortStr = String.valueOf(2);     // "2"
		String intStr = String.valueOf(3);       // "3"
		String longStr = String.valueOf(4L);     // "4L"
		String floatStr = String.valueOf(5.5F);  // "5.5F"
		String doubleStr = String.valueOf(5.5D); // "5.5D"
		String boolStr = String.valueOf(true);   // "true"	
		
		System.out.println(btStr);
	    System.out.println(shortStr);
	    System.out.println(intStr);
	    System.out.println(longStr);
	    System.out.println(floatStr);
	    System.out.println(doubleStr);
	    System.out.println(boolStr);
		 
	}
	
}
