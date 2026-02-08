package com.stringhandling;

public class TestStr7 {

	public static void main(String[] args) {
		// getBytes()

		String s = "Java";
		byte[] b = s.getBytes();

		for (byte x : b) {
			System.out.print(x + " ");
		}

		System.out.println();
		System.out.println();
		
		String str = "java";
		System.out.println(str.hashCode());
		
		System.out.println();
		String  n= "java point";

		System.out.println(n.indexOf('a'));     // 1  -- return the index value
		System.out.println(n.indexOf('p', 6));  // 3  -- returns the index values from char 'a' 

		
		
		
		System.out.println();
		String s1 = "Ratna";
		String s2 = "Rama";
		String s3 = "Raana";
		String s4 = "Ramya";
		String str1 = String.join("-", s1, s2, s3, s4, "Hello");
		System.out.println(str1);

	}

}
