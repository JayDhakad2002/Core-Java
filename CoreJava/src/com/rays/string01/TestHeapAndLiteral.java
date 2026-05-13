package com.rays.string01;

public class TestHeapAndLiteral {
	
	//1. When you create String object using "" it goes to literal pool
    //2. When you create String object using new keyword it goes to Heap momory 

   public static void main(String[] args) {
	
	   String s1 = "SUNRAYS";
	   String s2 = "SUNRAYS";
	   String s3 = new String("Welcom");
	   String s4 = new String("Welcome");
	   
	 System.out.println(s1 == s2);
	 System.out.println(s3 == s4);
	 
   }

}
