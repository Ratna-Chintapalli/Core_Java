package com.arrays;

public class ArrayElementsBtwn {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 2, 10 }, { 8, 9 }, { 1, 3 } };

		int[] a1 = m1(arr);
		for (int a2 : a1) {
			System.out.print(a2 + " ");
		}
 
	}

	static int[] m1(int[][] arr) {
		int n = arr.length;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			int left = arr[i][0];// 1
			int right = arr[i][1];// 2
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}

				int left1 = arr[j][0];// 2
				int right1 = arr[j][1];// 10
				if (left1 >= left && right1 <= right) {
					a[i] = 1;
					break;
				}
			}
		}
		return a;

	}

}
