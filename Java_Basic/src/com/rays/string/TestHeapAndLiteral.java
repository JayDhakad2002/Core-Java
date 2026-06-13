package com.rays.string;

  //1. When you create String object using "" it goes to Literal pool
  //2. When you create String object using new key word it goes to heap memory
  public class TestHeapAndLiteral {

   public static void main(String[] args) {  
	   
	   String s1 = "SUNRAYS";
	   String s2 = "SUNRAYS";
	   String s3 = new String("Welcome");
	   String s4 = new String("Welcome");
	   
	    System.out.println(s1 == s2);
	    System.out.println(s3 == s4);
	    
    }
   
}
  
  
  
	   
	   
