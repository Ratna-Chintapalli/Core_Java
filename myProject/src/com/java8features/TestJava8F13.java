package com.java8features;

import java.util.function.Consumer;
import java.util.function.Predicate;

class Student {
	int sid;
	double marks;
	String name;

	public Student(int sid, double marks, String name) {

		this.sid = sid;
		this.marks = marks;
		this.name = name;
	}

}

public class TestJava8F13 {

	public static void main(String[] args) {
		Predicate<Student> p1=(st)->st.marks>90;
		Predicate<Student> p2=(st)->st.name.contains("i");
		Predicate<Student> p3=p1.and(p2);
		
		Consumer<Student> c1=(s)->{
			System.out.println("ID : "+s.sid);
			System.out.println("Name : "+ s.name);
			System.out.println("Marks : "+s.marks);
			System.out.println("**************");
		};
		
		Student s1=new Student(7,96.0,"dhoni");
		Student s2=new Student(18,100.0,"Kohli");
		Student s3=new Student(45,75.0,"Rohit");
		Student s4=new Student(4,92.5,"Abhishek");
		Student[] listOfStd= {s1,s2,s3,s4};
		for(Student s: listOfStd) {
			if(p3.test(s)) {
				c1.accept(s);
			}
		}
	
	
	
	}

}
