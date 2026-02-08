package com.StringHandle;

public class UpperCase {

	public static void main(String[] args) {
		String s="java ";
		for (char c:s.toCharArray()) {
			//System.out.print((char)(c-32));
			System.out.print(Character.toUpperCase(c));
		}

	}

}
