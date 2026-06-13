package com.rays.string;

public class CountIntFromString {
	
	public static void main(String[] args) {
		 
		String str = "He5llo121";
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		  
		}
		System.out.println(count);
	}

}
