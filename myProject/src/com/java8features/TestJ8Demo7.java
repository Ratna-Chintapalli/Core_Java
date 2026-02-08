package com.java8features;

import java.util.function.Predicate;

public class TestJ8Demo7 {

	public static void main(String[] args) {
		Predicate<String> p1=s->s.length()>5;
		Predicate<String> p2=s -> s.contains("i");
		Predicate<String> p3=p1.and(p2);
		
		System.out.println(p1.test("JavaFullStack"));//true
		System.out.println(p3.test("javaFullStack"));//false

	}

}
