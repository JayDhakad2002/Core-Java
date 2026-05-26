package com.rays.oop.constructor;

public class TestAccount {
	
  public static void main(String[] args) {
	
	  Account a1 = new Account("911110100009437","saving", 50000.00);
	  
	  System.out.println(a1.getNumber());
	  System.out.println(a1.getaccountType());
	  System.out.println(a1.getBalance());
	  
    }
	
}
