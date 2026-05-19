package com.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class TestTimePeriod {
	
	public static void main(String[] args) {
		
		LocalDate todayDate = LocalDate.now();
		
		System.out.println("today's date: " + todayDate);
		
		LocalDate birthday = LocalDate.of(2002,04,8);
		
		System.out.println("your birth Date: " + birthday);
		
		Period period = Period.between(birthday, todayDate);
		
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());

	}

}
