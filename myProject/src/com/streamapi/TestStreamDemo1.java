package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

//1. Filter even numbers from a list
public class TestStreamDemo1 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(2, 2, 34, 5, 67, 889, 23, 44, 56);
		Optional<Integer> max =l1.stream().collect(Collectors.maxBy(Integer::compareTo));

		List<Integer> l = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		l.forEach(System.out::println);
		long c = l.stream().count();
		System.out.println("count : " + c);
		// 2. Find numbers greater than 10
		System.out.println();
		l1.stream().filter(n -> n < 10).forEach(System.out::println);

		// 3. Convert all strings to uppercase
		System.out.println("***********");
		List<String> s1 = Arrays.asList("java", "mysql", "Spring", "html");
		List<String> s = s1.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
		s.forEach(System.out::println);

		// 4. Count elements in a list
		System.out.println("***********");
		long c1 = l.stream().count();
		System.out.println(c1);

		// 5. Remove duplicate elements
		System.out.println("***********");
		l1.stream().distinct().forEach(System.out::println);

		// 6. Sort numbers in ascending order
		System.out.println("***********");
		l1.stream().sorted().forEach(System.out::println);

		// 7. Sort numbers in descending order
		System.out.println("***********");
		l1.stream().sorted((a, b) -> b - a).forEach(System.out::println);

		// 8. Find the first element
		System.out.println("***********");
		Optional<String> first = s.stream().findFirst();
		first.ifPresent(System.out::println);

		// 9. Find maximum number
		System.out.println("***********");
		//int max = l1.stream().max(Integer::compareTo).get();
		int min = l1.stream().min(Integer::compareTo).get();
		System.out.println(min);
		System.out.println(max);

		// 11. Check if any number is greater than 50
		System.out.println("***********");
		boolean result = l1.stream().anyMatch(n -> n < 1);// false
		System.out.println(result);

		// 12. Check if all numbers are positive
		boolean r = l1.stream().allMatch(n -> n > 0); // true
		System.out.println(r);

		// 14. Sum of all numbers
		System.out.println("***********");
		int sum = l.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		System.out.println("***********");
		// 15. Multiply all numbers15. Multiply all numbers
		int product = l.stream().reduce(1, (a, b) -> a * b);
		System.out.println(product);

		// 13. Square all numbers
		System.out.println("***********");
		l.stream().map(n -> n * n).forEach(System.out::println);

//		16. Convert list to Set
		System.out.println("***********");
		Set<Integer> set = l.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		//17. Join strings with comma
		String res=s.stream().collect(Collectors.joining(", "));
		System.out.println(res);
		
		List<String> s2 = Arrays.asList("java", "mysql", "Spring", "html");
		//String res1=s2.stream().collect(Collectors.groupingBy(s2::));
		//System.out.println(res1);


	}

}
