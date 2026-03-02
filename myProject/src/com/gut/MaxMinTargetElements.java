package com.gut;
import java.util.Arrays;
public class MaxMinTargetElements {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 7, 9, 1 };
		int target = 15;
		Arrays.sort(arr);
		//int count = 0;
		int sum = 0;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			sum = arr[left] + arr[right];
			if (sum == target) {
				System.out.println("Pair: " + arr[left] + " + " + arr[right] + " = " + target);
				left++;
				right--;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println();
		for (int i = 0; i <arr.length  - 3; i++) {
			for (int j = i + 1; j < arr.length  - 2; j++) {
				left = j + 1;
				right = arr.length  - 1;
				while (left < right) {
					sum = arr[i] + arr[j] + arr[left] + arr[right];
					if (sum == target) {
						System.out.println("4 Elements: " + arr[i] + " + " + arr[j] + " + " + arr[left] + " + "
								+ arr[right] + " = " + target);
						left++;
						right--;
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}

	}

}
