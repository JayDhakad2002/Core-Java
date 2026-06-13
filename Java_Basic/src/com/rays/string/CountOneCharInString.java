package com.rays.string;

public class CountOneCharInString {

	public static void main(String[] args) {

		String str = "Apple";
		int count = 0;
		
      for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'p') {
				count++;
			}
		}

		System.out.println('p' + " = " + count);

	}

}
