package com.rays.string;

public class CountAFromName {
	
	public static void main(String[] args) {
		
		String str = "JayDhakad";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) =='a') {
				count++;
			}
		}
		System.out.println('a' + "=" + count);
	}
}
