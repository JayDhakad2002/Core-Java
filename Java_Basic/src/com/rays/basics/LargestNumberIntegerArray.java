package com.rays.basics;

public class LargestNumberIntegerArray {
	
	public static void main(String[] args) {
	
	int[] intArray = {5,10,15,6,20,14};
	
	int LargestNo = intArray[0];
	
	for(int i=0;i<intArray.length;i++) {
		
		if(intArray[i]>LargestNo) {
			
			LargestNo=intArray[i];
			
		}
	}
		
	System.out.println("length no is:" + LargestNo);
	
  }
		
 }


	
