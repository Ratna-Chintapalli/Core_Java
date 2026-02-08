package com.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.collections.Student;

public class TestJava8F11 {

	public static void main(String[] args) {

		List<Student1> list = Arrays.asList(
			new Student1(3),
			new Student1(1),
			new Student1(2)
		);

		Collections.sort(list); // uses compareTo()
		System.out.println(list);
	}
}
