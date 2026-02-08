package com.StringHandle;

public class WordCount {

	public static void main(String[] args) {
//s.split("\\s+") : This splits the string using a regular expression (regex).
//    \\s -- > Any whitespace character (space, tab, newline)
//    + -->   One or more times
		String s="I Love Java r";
		System.out.println(s.split("\\s+").length);
	}

}
