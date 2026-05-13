package com.rays.basics;

public class TestStringArray {
	
	public static void main(String[] args) {
		
		String[] str= {"Orange","Mango","Apple"};
		
		for(int i=0;i<str.length;i++) {
			
			System.out.println(str[i]);
		}
		
		System.out.println("----------------");
		//ForEachLOop Method
		
		for(String s : str) {
			
			System.out.println(s);
			
		}
		
	}

}
              

      