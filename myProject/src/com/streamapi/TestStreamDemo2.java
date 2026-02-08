package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStreamDemo2 {

	public static void main(String[] args) {
		//18. Find second highest number
		List<Integer> l1 = Arrays.asList(2, 2, 34, 5, 67, 889, 203, 44, 56);
		int secondMax=l1.stream().distinct()
                .sorted((a,b) -> b - a).skip(1).findFirst().get();
		System.out.println(secondMax);		
		System.out.println("***********");
		//List<Integer> l = List.of(10, 20, 30, 40, 50, 60);
		l1.stream().skip(3).forEach(System.out::println);
		System.out.println();
		l1.stream().limit(4).forEach(System.out::println);


		System.out.println("***********");
		//19. Count occurrences of each element
		//-- Cannot invoke forEach(System.out::println) on the primitive type long
		//l1.stream().count().forEach(System.out::println);
		
		Map<Integer, Long> map =l1.stream()
			        .collect(Collectors.groupingBy(
			            n -> n, Collectors.counting()));

		System.out.println(map);

		System.out.println("***********");
		Map<Boolean, List<Integer>> result =
			    l1.stream()
			        .collect(Collectors.partitioningBy(n -> n % 2 == 0));

			System.out.println(result);



	}

}
