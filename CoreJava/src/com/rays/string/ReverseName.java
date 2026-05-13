package com.rays.string;

public class ReverseName {
	
	public static void main(String[] args) {
		
		String str = "JayDhakad";
		
		for(int i=str.length() -1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
	}
}