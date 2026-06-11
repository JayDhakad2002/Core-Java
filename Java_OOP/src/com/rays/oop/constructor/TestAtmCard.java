package com.rays.oop.constructor;

public class TestAtmCard {
	
	public static void main(String[] args) {

		Machine m = new Machine("uday", 10, 17, 18);
		System.out.println(m.getName());
		System.out.println(m.getCvc());
		System.out.println(m.getNumber());
		System.out.println(m.getBalance());

	}

}
