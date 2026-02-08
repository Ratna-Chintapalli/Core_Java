
package com.stringhandling;

public class TestStr5 {

	public static void main(String[] args) {
		//String s1="Java";
//intern() -- it is convertoing heap areap object to SCP 
/*
 * Actually here 2 objs are created by using the intern()  it both are referring to the same address
 * it returns a canonical representation for the string object
 * here the object is moving from heap area to SCP 
 */		
		String s1="Java";
		String s2=new String("Java");
		s2=s2.intern();//true
		System.out.println();
		s1=s1.intern();//false
		System.out.println(s1);
		System.out.println(s1==s2);
		System.out.println();
		
		
		
		
		
		String s = "Java";
		byte[] b = s.getBytes();

		for (byte x : b) {
		    System.out.print(x + " ");
		}

		
	}

}
