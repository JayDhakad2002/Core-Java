package com.rays.date.pratice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExerciseQ1 {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		//Input date of birth
		System.out.println("Enter Date of Birth(dd-mm-yyyy): ");
		String dobInput = sc.nextLine();
	
		//Define Date Format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		//Convert Input String To LocalDate
		LocalDate dob = LocalDate.parse(dobInput,formatter);
		
		//Get Current Date
		LocalDate currentDate = LocalDate.now();
		
		//Calculate age
		int age = Period.between(dob, currentDate).getYears();
		
		//Display age
		System.out.println("Employee Age is: " + age + "years");
		
		sc.close();
		
	}

}
