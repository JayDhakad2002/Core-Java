package com.rays.string.pratice;

public class ExerciseQ4 {
	
	public static void main(String[] args) {
		
		  // First statement: stores string in String Literal Pool
	    String str1 = "Vijay";

	    // Second statement: fetches the same string from the pool
	    String str2 = "Vijay";

	    // Check if both refer to same object
	    if (str1 == str2) {
	        System.out.println("Both strings refer to the same object in the String Literal Pool.");
	    } else {
	        System.out.println("Different objects.");
	    }    
	}
}
