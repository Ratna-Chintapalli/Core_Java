package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJ8Demo9 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,20,13,12,28,23,23,12,11,17);
		List<Integer> l1=l.stream().
									filter(i->i%2!=0).
									sorted().
									distinct().
									collect(Collectors.toList());
		System.out.println(l1);
		l1.forEach(System.out::println);
	}

}
