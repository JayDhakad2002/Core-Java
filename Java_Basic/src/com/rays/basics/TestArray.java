package com.rays.basics;

public class TestArray {
	
	public static void main(String[] args) {
		
		int[] a= {5,10,15,20,25,30};
		
		System.out.println("length of array;" + a.length);
		
		System.out.println("--------------");
	
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		
		System.out.println("ForLoop");
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(i + "=" +a[i]);
			
		}
		
	    System.out.println("ForEachLoop");
	    
	    for(int b:a) {
	    	
	    	System.out.println(b);
		}
	}
}
