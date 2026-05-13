package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat06 {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss:SSS");
		String str = sdf.format(d);
		System.out.println(str);
		
	}

}
