package com.rays.basics;

public class finfIntFromArray {
	
	public static void main(String[] args) {
		
	int []a = {2, 4, 6, 8, 10};
	int position = -1;
	int n = 8;
	
	for (int i = 0; i <= a.length; i++) {
		if (n == a[i]) {
			position = i;
			
			System.out.println("position of 8 is:" + position);
			
		}
		
	
	}
	if (position == -1){
		System.out.println(position);
		
	}
	
  }
	
}

