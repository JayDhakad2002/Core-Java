package com.rays.oop.encapsulation;

public abstract class TestEmployee {
	public static void main(String[] args) {
		Employee E1 = new Employee();
		E1.setName("Rahul");
		E1.setId(01);
		E1.setSalary(50000);
		E1.setWorkinghours("8 hours");

		System.out.println("Employee NAME = " + E1.getName());
		System.out.println("Employee ID = " + E1.getId());
		System.out.println("Employee Salary = " + E1.getSalary());
		System.out.println("Employee Working hours = " + E1.getWorkinghours());

		System.out.println("---------------");

		Employee E2 = new Employee();
		E2.setName("Nitin");
		E2.setId(02);
		E2.setSalary(40000);
		E2.setWorkinghours("8 hours");

		System.out.println("Employee NAME = " + E2.getName());
		System.out.println("Employee ID = " + E2.getId());
		System.out.println("Employee Salary = " + E2.getSalary());
		System.out.println("Employee Working hours = " + E2.getWorkinghours());

		System.out.println("---------------");
		
		Employee E3 = new Employee();
		E3.setName("Ajay");
		E3.setId(03);
		E3.setSalary(30000);
		E3.setWorkinghours("8 hours");
		
		System.out.println("Employee NAME = "+ E3.getName());
		System.out.println("Employee ID = "+ E3.getId());
		System.out.println("Employee Salary = " +E3.getSalary());
		System.out.println("Employee Working hours = "+ E3.getWorkinghours());
		

	}

}