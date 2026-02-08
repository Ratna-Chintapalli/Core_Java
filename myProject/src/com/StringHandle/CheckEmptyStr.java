package com.StringHandle;

public class CheckEmptyStr {

	public static void main(String[] args) {
		String s=" ";
		System.out.println(s.isBlank());//true
		System.out.println(s.length());//1
		String s1="";
		System.out.println(s1.length());//0
		System.out.println(s1.isEmpty());//true
		String str=" ,java";
		System.out.println(str.length());//6
		System.out.println(str.isEmpty());//false

	}

}
