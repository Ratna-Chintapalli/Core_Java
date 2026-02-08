package com.java8features;

import java.util.function.Function;

public class TestJ8Demo1 {

	public static void main(String[] args) {
		Function<Integer, Integer> s = salary -> {
		    if (salary < 20000)
		        return salary + (salary * 10 / 100);
		    else
		        return salary + (salary * 5 / 100);
		};

		System.out.println(s.apply(15000));
		System.out.println(s.apply(30000));


	}

}
