package com.stringhandling;

import java.nio.charset.StandardCharsets;

public class TestStr6 {

	public static void main(String[] args) {
		//copyValueOf()
		String a="java";
		//String b="Java";
		 char[] ch={'J','a','v','a','i','s'};
		 String s5=String.copyValueOf(ch);
		 System.out.println(s5);
		 String s = String.copyValueOf(ch,2,3);
		 System.out.println(s);
		System.out.println();
		
		
		//getBytes()
		byte[] b1 = {74, 97, 118, 97};
		String str = new String(b1, StandardCharsets.UTF_8);
		System.out.println(str); // Java

		System.out.println();
		
		//contentEquals()
		StringBuffer b=new StringBuffer("java");
		System.out.println(a.contentEquals(b));
		
		//isEmpty(),isBlank()
		String s1="";
		String s2=" ";
		String s3=null;
		System.out.println(s1.isEmpty());//true
		System.out.println(s1.isBlank());//true
		
		System.out.println(s2.isEmpty());//false
		System.out.println(s2.isBlank());//true
		
		System.out.println(s3.isEmpty());//NPE
		System.out.println(s3.isBlank());//NPE
		
		

	}

}
