package com.rays.date.pratice;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ExerciseQ3 {

	    public static void main(String[] args) {

	        // Check if two arguments are passed
	        if (args.length != 2) {
	            System.out.println("Usage: java DateValidator <start-date> <end-date>");
	            System.out.println("Example: java DateValidator 2026-05-01 2026-05-10");
	            return;
	        }

	        try {
	            // Read dates from command line
	            LocalDate startDate = LocalDate.parse(args[0]);
	            LocalDate endDate = LocalDate.parse(args[1]);

	            // Compare dates
	            if (endDate.isBefore(startDate)) {
	                System.out.println("Error: End date cannot be less than start date.");
	            } else {
	                System.out.println("Dates are valid.");
	            }

	        } catch (DateTimeParseException e) {
	            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
	      }
	 }
}
	
