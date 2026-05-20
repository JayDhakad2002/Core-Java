package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person a = new Person();
		
		a.setName("modi Ji");
		a.setDob(sdf.parse("1950-09-17"));
		a.setAddresss("gujrat");
		
		System.out.println(a.getName());
		System.out.println(a.getdob());
		System.out.println(a.getAddress());
		
	}

}
