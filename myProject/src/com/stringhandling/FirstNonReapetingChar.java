package com.stringhandling;

import java.util.Scanner;

public class FirstNonReapetingChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");//swiss
		String s=sc.nextLine();
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(s.indexOf(ch)==(s.lastIndexOf(ch))) {
			//if(res.indexOf(ch)==-1) {
				res=res+ch;
				break;
				
			}
		
		}
		System.out.println(res);
		

	}

}
