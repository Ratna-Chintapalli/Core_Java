package com.stringhandling;

public class TestStr2 {

	public static void main(String[] args) {
		String s1="Java"; // Memory is created in SCP -- 1 object    --> o/p : Java
		String s2="Java"; // 0 object								 --> o/p : Java
		String s3="Java"; // 0 object								 --> o/p : Ratna
		s3="Ratna"; // Re-assigning 
		System.out.println(s1); //Java
		System.out.println(s2); //Java
		System.out.println(s3); //Ratna
		
		String s4=new String("Vcube"); // 2 objects ( 1 in heap + 1 in SCP[String Constant Pool] )
		String s5=new String("Vcube"); // 1 object in heap 
		String s6=new String("Vcube"); // 1 object in heap
		
		String s7=new String();
		s7=s6; // Re-assaigning - it is eligible for the garbage collection 
		
		
		

	}

}
