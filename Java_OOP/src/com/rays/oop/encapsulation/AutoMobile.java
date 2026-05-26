package com.rays.oop.encapsulation;

public class AutoMobile {
	
	private String color;
	private int speed;
	private String make;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
    public int getSpeed() {
    	return speed;
    }
    
    public void setSpeed(int Speed) {
    	this.speed = Speed;
    }
    
    public String getMake() {
    	return make;
    }
    
    public void setMake(String make) {
    	this.make = make;
    }
    
    public void brake() {
    	
    	if (speed == 0) {
    	   System.out.println("car already stopped");
    	}else {
    		speed = speed +10;
    	}
    }
    
    public void acclerator() {
    	
    	if (speed == 400 || speed > 400) {
    		System.out.println("speed limit is high please apply brake");
    	}else {
    		speed = speed + 10;
    	}
    }
    
}
