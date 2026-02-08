package com.stringhandling;

public class TestStr9 {

	public static void main(String[] args) {
		String s1="Java is Simple";
		System.out.println(s1.substring(5));
		// substring -returns a String
		System.out.println(s1.substring(0, 3));
		
		
		// If you want char sequence use subsequence
		System.out.println(s1.subSequence(0, 3));

	}

}
