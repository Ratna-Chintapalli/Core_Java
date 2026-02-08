package com.StringHandle;

public class SwapTwoStrs {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Vcube";
		s=s+s1;
//substring() -- is a method of the String class used to extract (cut) a part of a string and return it as a new string.
		
//substring() extracts a portion of a string based on given index positions.
		s1=s.substring(0,s.length()-s1.length());
		s=s.substring(s1.length());
		System.out.println(s+ "   "+s1);

	}

}
