package com.tcsnqtQuestions;

import java.util.Scanner;

public class MoveAllZerosToEnd {
	static void moveZerosEnd(int[] arr) {
		int k=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=0) {
				arr[k]=arr[i];
				k++;
			}
		}
		while(k<arr.length) {
			arr[k]=0;
			k++;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		for(int a:arr) {
			System.out.println(a);
		}

		moveZerosEnd(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
