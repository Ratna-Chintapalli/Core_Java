package com.arrays;

public class CountNumberArr {

	public static void main(String[] args) {
		int[] array = { 133, 231, 153, 193 };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			int rem = 0;

			while (number != 0) {

				rem = number % 10;
				if (rem == 3) {
					count = count + 1;
				}

				number = number / 10;

			}
		}
		System.out.print(count + " ");


	}

}
