package com.arrays;

import java.util.Scanner;

public class TDemo3 {

	public static void main(String[] args) {
		/*
		  Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int n=sc.nextInt();
		System.out.println("ENter Array Elements : ");
		String[] array=new String[n];
		for(int i=0;i<array.length;i++) {
			array[i]=sc.next();
			System.out.print(" "+array[i]);
			
		}
		System.out.println();
		System.out.println("Array Elements :  ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		**/
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Array size : ");
//		int n=sc.nextInt();
//		System.out.println("ENter Array Elements : ");
		/*
		//Char cannot be resolved to a type
		Char[] array=new Char[n];
		
		**/
		//short[] array=new short[n];
		//byte[] array=new byte[n];
		
		//Type mismatch: cannot convert from boolean[] to boolean
		boolean[] array=new boolean[5] ;
		//long[] array=new long[n];
		
		
		//The primitive type boolean of array does not have a field length
		for(int i=0;i<array.length;i++) {
			
			System.out.print(" "+array[i]);
			
		}
		System.out.println();
		
		

	}

}
