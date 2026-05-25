package com.rays.oop.encapsulation;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setNumber("91110100009437");
		a.setAccountType("saving");
		a.setBalance(500.00);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
		
	}

}
