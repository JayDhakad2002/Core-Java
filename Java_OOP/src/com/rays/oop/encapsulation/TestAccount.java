package com.rays.oop.encapsulation;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setNumber("91110100009437");
		a.setAccountType("saving");
		a.setBalance(5000.00);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());
		a.deposit(500.00);
		a.withdrawal(2500.00);
		a.withdrawal(1000.00);
	}

}
