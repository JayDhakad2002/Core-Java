package com.rays.date.pratice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExerciseQ2 {
	
	public static void main(String[] args) {
		
		//Installation date (YYYY-MM-DD)
		String installationDateInput = "2026-05-08";
		
		//Formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		//Convert string to LOcalDate
		LocalDate installationDate = LocalDate.parse(installationDateInput);
		
		System.out.println("Instrument Installation" + installationDate.format(formatter));
		
		System.out.println("/nOne-Year Maintenance Schedule (Every 30 Days):");
		
		//Generate maintenance dates for 1 year
		LocalDate maintenanceDate = installationDate.plusDays(30);
		
		while (maintenanceDate.isBefore(installationDate.plusYears(1))
			   || maintenanceDate.isEqual(installationDate.plusYears(1))){
			
			System.out.println("Maintenance Date: "+ maintenanceDate.format(formatter));
			
			//Next maintenance after 30 days 
			maintenanceDate = maintenanceDate.plusDays(30);
			
		}
		
	}
	
}