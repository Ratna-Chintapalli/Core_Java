package com.gut;

import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequencyJava8 {

	public static void main(String[] args) {
		String s = "JavaStream";
		Map<Character, Long> r = s.toLowerCase().chars().mapToObj((c) -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(r);
		// r.forEach((k, v) -> System.out.println(k + " = " + v));

		/**
		 * const str = "javascript";
		 * const vowelCount = str .toLowerCase() .split("") .filter(ch => ["a", "e",
		 * "i", "o", "u"].includes(ch)) .length; 
		 * console.log(vowelCount); // 3
		 */

	}

}
