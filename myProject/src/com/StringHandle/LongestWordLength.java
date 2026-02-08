package com.StringHandle;

public class LongestWordLength {

	public static void main(String[] args) {
		String s="Java Programming language is very simple";
		String max="";
		for(String w:s.split(" ")) {
			if(w.length()>max.length()) {
				max=w;
			}
		}
		System.out.println(max);

	}

}
