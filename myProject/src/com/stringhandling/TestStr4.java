package com.stringhandling;

public class TestStr4 {

	public static void main(String[] args) {
		String str="Raatna";
		System.out.println(str.codePointAt(0));// codePointAt() -- Returning Character Unincode integer of specified index
		System.out.println(str.codePointBefore(2)); //
		System.out.println(str.codePointCount(1, 5)); // No of unicode points in the range 
		System.out.println();
		
		String s1="Ratna"; // 116
		String s2="Rama"; //109  --> 116-109=7
		System.out.println(s1.compareTo(s2)); //7
		System.out.println();
		
		String s3="Java";//74
		String s4="java";//106
		System.out.println(s3.compareTo(s4)); //-32
		System.out.println(s3.compareToIgnoreCase(s4));  //0  coz same values 
		
		System.out.println();
		String s5="Srikanth";
		String s6="Srikanth Java";
		System.out.println(s5.compareTo(s6));
		
		System.out.println(s5+s6);
		System.out.println(s5.concat(s6));
	}

}
