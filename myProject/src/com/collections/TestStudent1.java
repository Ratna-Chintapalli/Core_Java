package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestStudent1 {
	public static void main(String[] args) {
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "hello", 79));
//		list.add(new Student(1, "hi", 90));
//		list.add(new Student(1, "welcome", 80));
//		list.add(new Student(1, "helo", 95));
//		for(Student std:list) {
//			System.out.println(std);
//		}
		Student s1=new Student(1, "hello", 79);
		Student s2=new Student(1, "hi", 90);
		Student s3=new Student(1, "welcome", 80);
		Student s4=new Student(1, "helo", 95);
		Set<Student> std=new HashSet<>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		for(Student s:std) {
			System.out.println(std);
		}
	}
}