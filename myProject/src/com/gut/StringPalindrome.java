package com.gut;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);

	}

}
