package com.java8features;


public class Student1 implements Comparable<Student1> {
	int id;
	public Student1(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Student1 s) {
		return this.id - s.id; // ascending order
	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}
}


