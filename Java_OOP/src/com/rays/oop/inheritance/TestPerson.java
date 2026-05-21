package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args)throws ParseException {
		
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
      BusinessMan b = new BusinessMan();
   
      b.setName("Jay");
      b.setAddress("Indore");
      b.setIncome(200000);
      
      System.out.println("Nmae: " + b.getName());
      System.out.println("Address:" + b.getAddress());
      System.out.println("Income: " + b.getIncome());
      
      
      System.out.println("-----Doctor-----");
      
      Doctor d = new Doctor();
      
      d.setName("Jay");
      d.setAddress("Indore");
      d.setRegistrationNo("998877665544");
      
      System.out.println("Name: " + d.getName());
      System.out.println("Address: " + d.getAddress());
      System.out.println("Income: " + d.getRegistrationNo());
      
      System.out.println("-----Student-----");
      
      Student s = new Student();
      
      s.setName("Jay");
      s.setAddress("Indore");
      s.setDate(sdf.parse("2002-04-8"));
      s.setRollNo("2413876");
      s.setMarks(99);
      
      System.out.println("Name: " + s.getName());
      System.out.println("Address: " + s.getAddress());
      System.out.println("dob: " + sdf.format(s.getDate()));
      System.out.println("Roll No: " + s.getRollNo());
      System.out.println("Marks: " + s.getMarks());
      
	}

}
