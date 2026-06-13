package com.rays.basics;

import java.util.Random;

public class GenerateRandomNo {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		for(int i=0; i<5; i++) {
			
			int Random = r.nextInt(100);
			
			System.out.println(Random);
		}
		
	}

}
