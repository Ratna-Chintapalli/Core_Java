package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
// Consumer – Print Only Even Numbers
public class TestJ8Demo5 {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 15, 20, 25, 30);
		Consumer<Integer> c=n->{
			if (n % 2 == 0)
		        System.out.println(n);
		};
		num.forEach(c);
	}

}
