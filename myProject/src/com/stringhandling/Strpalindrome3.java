package com.stringhandling;

public class Strpalindrome3 {

	public static void main(String[] args) {
		/*
		 * 		StringBuffer(s) → stores the string
		 * 		StringBuffer is thread-safe
		 * 		Used in multi-threaded programs
		 * 		.reverse() → reverses the string
		 * 		.toString() → converts back to String
		 */
		String s = "madam";
		String rev = new StringBuffer(s).reverse().toString();

		System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");

	}

}
