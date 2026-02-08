package com.stringhandling;

import java.util.Scanner;
//charAt() , equals(),equaslsIgnoreCase()
public class TestStr3_Palindrome1 {
// WAP to print Reverse String from a given String 
// WAP to find String palindrome 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		String rstr="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			rstr=c+rstr;
		}
		System.out.println("Reverse String : " + rstr);
		
		if(s.equalsIgnoreCase(rstr)) {
			System.out.println("Palindrome ");
		}else {
			System.out.println("Not a Palindrome ");
		}
	}

}
