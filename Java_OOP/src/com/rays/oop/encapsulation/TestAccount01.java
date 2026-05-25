package com.rays.oop.encapsulation;

public class TestAccount01 {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setNumber("911110100009437");
		a.setAccountType("Saving");
		a.setBalance(1000.00);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
	    
	}
	
}