package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestBusinessMan {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		BusinessMan B = new BusinessMan();
		B.setIncome(100000.0);
		B.setName("Jay");
		B.setAddress("Indore");
		B.setDate(sdf.parse("08-04-2002"));
		
		System.out.println("INCOME:- " + B.getIncome());
		System.out.println("NAME:- " + B.getName());
		System.out.println("ADDRESS:- " + B.getAddress());
		System.out.println("DOB:- " + sdf.format(B.getDate()));
		
	}
	
}