package com.collections;

public class Student implements Comparable<Object>{
	
	
	int id;
	String name;
	int marks;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	
	
}
