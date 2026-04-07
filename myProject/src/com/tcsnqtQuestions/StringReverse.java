package com.tcsnqtQuestions;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String s="madam  Hi How are you";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println("Reversed String : "+rev);
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		String s1="listen";
		String s2="silent";
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			System.out.println("Anagram");
		}

	}

}
