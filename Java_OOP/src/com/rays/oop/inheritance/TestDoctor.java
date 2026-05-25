package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDoctor {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Doctor D = new Doctor();
		 
		D.setName("Ram");
		D.setAddress("Delhi");
		D.setDate(sdf.parse("12-10-2000"));
		D.setRegistrationNo("12321565");
		
		System.out.println("NAME:- " + D.getName());
		System.out.println("ADDRESS:- " + D.getAddress());
		System.out.println("DOB:- " + sdf.format(D.getDate()));
		System.out.println("Registration NO:- " + D.getRegistrationNo());
		
		
	}

}