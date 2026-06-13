package com.rays.basics;

import java.util.Random;

public class RandomNo {
	
	public static void main(String[] args) {
		
	Random r = new Random();
	for (int i = 0; i<10; i++) {
	 int randomnumber = r.nextInt(50);
     System.out.println(randomnumber);		
	  }
	
   }

}