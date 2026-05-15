package com.rays.string.pratice;

public class ExerciseQ3 {
	
	public static void main(String[] args) {
		String str = "Vijay Chauhan";
		char ch = 'h';
		int count = 0;
		
		for (int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch){
				count++;
			}
		}
		
		System.out.println("Occurrence:" + count);
		
	}

}
