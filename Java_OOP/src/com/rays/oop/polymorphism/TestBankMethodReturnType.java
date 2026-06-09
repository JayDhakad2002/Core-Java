package com.rays.oop.polymorphism;

public class TestBankMethodReturnType {
	
	public static void main(String[] args) {
		
		Bank[] banks = new Bank[3];
		
		banks[0] = Bank.getBank(1); //new HDFCBank();
		banks[1] = Bank.getBank(2); //new ICICIBank();
		banks[2] = Bank.getBank(3); //new AxisBank();
		
		
		HomeLoanEnquiry(banks);
	
	}
	
	public static void HomeLoanEnquiry(Bank[] banks){
		for(int i = 0; i<banks.length; i++) {
		   System.out.println(banks[i].getName());
		   System.out.println(banks[i].intersetRate());
		   System.out.println("--------------");
		}
	
	}
	
}
