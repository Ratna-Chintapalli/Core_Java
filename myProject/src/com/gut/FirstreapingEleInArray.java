package com.gut;

public class FirstreapingEleInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 5, 3, 4, 2, 3 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					//System.out.println("First repeating element : " +arr[i]);
					count = count + 1;
					if (count == 2) {
						System.out.println("Second Reapting element  :"+arr[i]);
					}
				}
			}
		}
		//System.out.println(count);

	}

}
