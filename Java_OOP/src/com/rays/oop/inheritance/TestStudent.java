package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestStudent {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Student s = new Student();
		s.setName("Rishabh");
		s.setAddress("Indore");
		s.setRollNo("R123456");
		s.setMarks(500);
		s.setDate(sdf.parse("1-06-2002"));
		
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getRollNo());
		System.out.println(s.getMarks());
		System.out.println(sdf.format(s.getDate()));
		
	   	
	}

}