package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJ8Demo8 {

	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(1,2,3,4,5,6,7,8);
		Stream<Integer> l=n.stream();
		List<Integer> l1=l.filter(i->i%2==0).
							collect(Collectors.toList());
		System.out.println(l1);

	}

}
