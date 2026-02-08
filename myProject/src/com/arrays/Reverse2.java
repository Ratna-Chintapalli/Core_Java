package com.arrays;

import java.util.Scanner;

public class Reverse2 {
	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
			start++;
			end--;
		}
	}

	static void reverseArrayRtoL(int[] arr, int r) {
		int start = 0;
		int mid = (arr.length - 1) / 2;
		int end=arr.length-1;

		reverse(arr, start, mid-1);

		reverse(arr, mid, r - 1);

		reverse(arr, r, end);

	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count how many times you want to rotate : ");
		int r=sc.nextInt();
		System.out.println();
		reverseArrayRtoL(arr,r);

		for(int a:arr) {
			System.out.print(a + "   ");
		}


	}

}
