package com.rays.oop.abstraction;

public class TestBusinessman {
	
	public static void main(String[] args) {
		
		Richman r = new Businessman() ;
		
		r.donation();
		r.earnmoney();
		r.party();
		
		System.out.println("-------------");
		
		SocialWorker s = new Businessman();
		
		s.helpToOthers();
		
		System.out.println("-------------");
		
		Businessman bm = new Businessman();
		
		bm.donation();
		bm.earnmoney();
		bm.helpToOthers();
		bm.party();
	}

}
