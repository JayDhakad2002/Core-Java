package com.rays.basics;

public class PalindromeNo {
	
	public static void main(String[] args) {
		
    int num=131;
	int num2=num;
	int r=0;
	int sum=0;
	
	while(num2!=0) {
		r=num2%10;
		sum=(sum*10)+r;
		num2=num2/10;
	}
	
	System.out.println("reverse no."+sum);
	
	if(sum==num) {
		System.out.println(sum + " is a palindrome");
	}else {
		System.out.println(sum+" is not a palindorme");
	}
				
	}
 
}
