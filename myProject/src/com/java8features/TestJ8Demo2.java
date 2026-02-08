package com.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestJ8Demo2 {

	public static void main(String[] args) {
		Function<String, String> stringProcess = s -> s.replace(" ", "").toUpperCase();
		System.out.println(stringProcess.apply("Java is Simple"));
		System.out.println();
		
		Predicate<String> passwordCheck =p -> p.length() >= 8 && p.matches(".*\\d.*");

		System.out.println(passwordCheck.test("Java1234")); // true
		System.out.println(passwordCheck.test("java"));     // false
		
		



	}

}
