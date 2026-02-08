package com.arrays;

public class Even_Odd_Reverse_Square {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i % 2 !=0 && i!=j) {
					arr[i][j] = arr[i][j] * 2;
				}
				if (i % 2 == 0) {
					int start = 0;
					int end = arr[i].length - 1;
					while (start < end) {
						int temp = arr[i][start];
						arr[i][start] = arr[i][end];
						arr[i][end] = temp;
						start++;
						end--;
					}
				}
				if (i == j) {
					arr[i][j] = arr[i][j] * arr[i][j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
