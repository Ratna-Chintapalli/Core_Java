package com.arrays;

import java.util.Scanner;

public class TDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size : ");
		// Negative indexing is not possible here 
		//Exception in thread "main" java.lang.NegativeArraySizeException: -3
		int n=sc.nextInt();
		System.out.println("ENter Array Elements : ");
		double[] array=new double[n];
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextDouble();
			System.out.print(" "+array[i]);
			
		}
		System.out.println("  Array Elements :  ");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
		

	}

}
