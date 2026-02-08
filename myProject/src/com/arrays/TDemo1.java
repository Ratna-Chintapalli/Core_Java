package com.arrays;

import java.util.Scanner;

public class TDemo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size : ");
		// Negative indexing is not possible here 
		//Exception in thread "main" java.lang.NegativeArraySizeException: -3
		int n=sc.nextInt();
		System.out.println("ENter Array Elements : ");
		int[] array=new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
			//System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("Array Elements : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"  ");
			/* if(array[i]%2==0) {
				System.out.println("Even element " + array[i]);
			}else {
				System.out.println("Odd element "+array[i]);
			}  */
			
		}
	}

}
