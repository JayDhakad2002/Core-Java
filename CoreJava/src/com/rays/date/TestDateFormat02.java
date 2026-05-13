package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat02 {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM,dd G 'at' hh:ss z");
		String str = sdf.format(d);
		System.out.println(str);
	}

}
