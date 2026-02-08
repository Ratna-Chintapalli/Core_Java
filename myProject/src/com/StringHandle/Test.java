package com.StringHandle;

public class Test {

	public static void main(String[] args) {
		String a="hello";
		String b="hel"+"lo";
		String c="hel";
		String d=c+"lo";
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		System.out.println(d);
// == operator will the references 
		System.out.println(a==b);
		System.out.println(a==d);

	}

}
