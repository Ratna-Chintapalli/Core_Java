package com.oops.abstraction;

public abstract class Employee {
	static int id;
	static String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	abstract int calculate();
	static void displaydetails() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee Name :"+name );
		
	}
	

}
