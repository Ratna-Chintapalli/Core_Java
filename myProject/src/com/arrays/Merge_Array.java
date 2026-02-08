package com.arrays;

public class Merge_Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int arr1[] = { 5, 6, 7, 8, 9 };
		int c[] = new int[arr.length + arr1.length];
		for (int i = 0; i < c.length; i++) {
			if(i<arr.length) {//0
				c[i] = arr[i];
			}
			if(i<arr1.length) {//0,1,
				c[arr.length + i] = arr1[i];
				//c[4]=5
				//c[5]=6
			}
		}
	
		for (int u = 0; u < c.length; u++) {
			System.out.print(c[u] + " ");
		}

	}

}
