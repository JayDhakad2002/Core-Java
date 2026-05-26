package com.rays.oop.encapsulation;

public class Account01 {
	
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
		System.out.println("total balance after transfer: " + balance);
	}

	public void withdrawal(double amt) {
		if(amt > balance) {
			System.out.println("insufficent fund transfer");
		}else {
			balance = balance - amt;
			System.out.println("total balance after withdrawal: " + balance);
		}
	}
}
