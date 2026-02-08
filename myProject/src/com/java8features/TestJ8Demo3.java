package com.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestJ8Demo3 {

	public static void main(String[] args) {
		Predicate<String> p=(s)->s.equals(new StringBuilder(s).reverse().toString() );
		System.out.println(p.test("madam")); // true
		System.out.println(p.test("java")); // false
		System.out.println();
		
		Function<String,String> f=(s)->(new StringBuilder(s).reverse().toString());
		System.out.println(f.apply("Ratna"));
		
		
	}

}
