package com.rays.date.pratice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormate {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("default format date: " + d);
		
    String s = sdf.format(d);
    System.out.println("format date: " + s);
    
    System.out.println("----------");

    String dob = "2002-06-8";
    System.out.println("string dob: " + dob);
    
    Date date = sdf.parse(dob);
    
    System.out.println("date dob: " + date);
    
    String D = sdf.format(date);
    System.out.println(D);
	}
}
