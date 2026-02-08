package com.StringHandle;

public class CountCharWithLength {

	public static void main(String[] args) {
		String s="java";
		int count=0;
//toCharArray()	: Converts this string to a new character array
		for(char c: s.toCharArray()) {
			count++;	
		}
		System.out.print(count);

	}

}
