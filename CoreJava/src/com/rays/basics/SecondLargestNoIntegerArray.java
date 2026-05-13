package com.rays.basics;

public class SecondLargestNoIntegerArray {
	
	public static void main(String[] args) {
		
		int[]intArray = {5,10,150,6,20,14};
		
		int LargestNo = intArray[0];
		
		for(int i=0;i<intArray.length;i++){
			if(intArray[i]>LargestNo) {
				LargestNo=intArray[i];
			}
		}
		
		System.out.println("first LargestNo:" + LargestNo);
		
	    int SecondLargestNo=intArray[0];
		
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]<LargestNo && intArray[i]>SecondLargestNo) {
			 SecondLargestNo=intArray[i];
			}
		}
		
		System.out.println("SecondLargestNo:" + SecondLargestNo);
		
	}
	
}
