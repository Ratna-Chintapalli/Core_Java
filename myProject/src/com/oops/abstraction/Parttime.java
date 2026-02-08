package com.oops.abstraction;

public class Parttime extends Employee{
	int hours;
	int hourlyCharge;

	public Parttime(int id, String name,int hours,int hourlyCharge) {
		super(id, name);
		this.hours=hours;
		this.hourlyCharge=hourlyCharge;
		
	}

	@Override
	int calculate() {
		System.out.println("Hours :"+hours);
		System.out.println("Houly charge :"+hourlyCharge);
		int sal=hours*hourlyCharge;
		//System.out.println("Part Time Salary :"+sal);
		return sal;
	}
	static void displaydetails() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee Name :"+name );
		
	}

	

}
