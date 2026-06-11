package com.rays.oop.abstraction;

public class TestAnimal01 {
	
	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		
        a1.say();
        
        Animal a2 = new Dog();
        
        a2.say();
        
        Animal a3 = new Tiger();
        
        a3.say();
	}

}
