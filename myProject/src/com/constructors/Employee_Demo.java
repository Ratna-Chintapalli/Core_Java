package com.constructors;

public class Employee_Demo {
	int empid;
	String ename;

	Employee_Demo() {
		empid = 0;
		ename = "Unknown";

	}

	Employee_Demo(int empid, String ename) {
		this.empid = empid;
		this.ename = ename;

	}

	public static void main(String[] args) {
		Employee_Demo e = new Employee_Demo();
		e.display();

		Employee_Demo e1 = new Employee_Demo(1, "Smith");
		e1.display();
	}

	void display() {
		System.out.println(empid);
		System.out.println(ename);
	}

}
