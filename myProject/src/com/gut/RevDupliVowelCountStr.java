package com.gut;

import java.util.Scanner;

public class RevDupliVowelCountStr {
	static String reversed(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			rev=rev+c;
		}
		return rev;
	}
	
	static int vowelCount(String s) {
		String rev="";
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			String s1=s.toLowerCase();
			char c1=s1.charAt(i);
			if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
				count=count+1;		
			}
			
		}
		return count;
		
	}
	static void removeDuplicate1(String s) {
	    String res = "";
	    for (int i = 0; i < s.length(); i++) {
	        boolean isDuplicate = false;
	        for (int j = 0; j < i; j++) {
	            if (s.charAt(i) == s.charAt(j)) {
	                isDuplicate = true;
	                break;
	            }
	        }
	        if (!isDuplicate) {
	            res = res + s.charAt(i);
	        }
	    }

	    System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.next();
		System.out.println("Reversed String : "+reversed(s));
		System.out.println("Vowel Count : "+vowelCount(s));
        removeDuplicate1(s);

	}

	 


	 

}
