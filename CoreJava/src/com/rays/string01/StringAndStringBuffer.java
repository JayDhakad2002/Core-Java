package com.rays.string01;

public class StringAndStringBuffer {
	
public static void main(String[] args) {
		
		// String object is immutable value cannot be changed
		String name = "sunrays";
		
		System.out.println(name);
		System.out.println(name.replace('s', 't'));
		System.out.println(name);
		
		
		System.out.println("-------------");
		
		// StringBuffer object is mutable value can be changed
		StringBuffer sb = new StringBuffer("sunrays");
		System.out.println(sb);
		System.out.println(sb.append("house"));
		System.out.println(sb);
		
		
	}
}
