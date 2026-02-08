package com.oops.abstraction;

public class FullTime extends Employee{
	int months;
	int monthlySal;

	public FullTime(int id, String name,int months,int monthlySal) {
		super(id, name);
		this.months=months;
		this.monthlySal=monthlySal;
	}

	@Override
	int calculate() {
		System.out.println("Months :"+months );
		System.out.println("Monthly Salary : "+monthlySal);
		int sal1= months*monthlySal;
		//System.out.println("Full  Time Salary :"+sal1);
		return sal1;
	}
	static void displaydetails() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee Name :"+name );
		
	}


}
