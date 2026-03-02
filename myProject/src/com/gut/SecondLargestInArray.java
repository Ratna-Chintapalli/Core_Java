package com.gut;

import java.util.Scanner;

public class SecondLargestInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		int secondmax=arr[0];
		System.out.println("Array Elements :  ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}if(secondmax<arr[i] && arr[i]!=max ) {
				secondmax=arr[i];
			}
		}
		System.out.println();
		System.out.println("Maximum : "+max);
		System.out.println("Minimun : "+min);
		System.out.println("Second Largest : "+secondmax);

	}

}
