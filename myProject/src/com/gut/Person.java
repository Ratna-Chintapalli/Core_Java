package com.gut;

import java.time.LocalDate;

public class Person implements Comparable{

	private String name;
	private double sal;
	private int dept;
	private LocalDate joining;
	private String status;
	public Person() {
		
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", sal=" + sal + ", dept=" + dept + ", joining=" + joining + ", status="
				+ status + "]";
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public LocalDate getJoining() {
		return joining;
	}

	public void setJoining(LocalDate joining) {
		this.joining = joining;
	}

	public Person(String name, double sal,int dept,LocalDate joining,String status) {
		this.name = name;
		this.sal = sal;
		this.dept=dept;
		this.joining=joining;
		this.status=status;
	}


	 @Override
	 public int compareTo(Object o) {
		 Person p=(Person)o;
	     return this.joining.compareTo(p.getJoining());
	 }
	

}
