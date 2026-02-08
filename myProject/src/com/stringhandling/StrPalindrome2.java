package com.stringhandling;

public class StrPalindrome2 {

	public static void main(String[] args) {
//		String s = "madam";
//		String rev = new StringBuilder(s).reverse().toString();
//
//		if (s.equals(rev))
//		    System.out.println("Palindrome");
//		else
//		    System.out.println("Not Palindrome");
		
		
		String s = "Madam, I'm Adam";
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		String rev = new StringBuilder(s).reverse().toString();
		if(s.equals(rev)) {
			System.out.println("Palindrome ");
		}else {
			System.out.println("Not Palindrome ");
		}
		


	}

}
