package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson02 {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person a = new Person();
		
		a.setName("Jay");
		a.setDob(sdf.parse("2002-04-8"));
		a.setAddresss("unhel");
		
		System.out.println(a.getName());
		System.out.println(a.getdob());
		System.out.println(a.getAddress());
	}

}
