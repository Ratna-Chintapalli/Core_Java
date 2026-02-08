package com.arrays;
public class ReverseArrElements {
	public static void main(String[] args) {
		int[] array = { 12, 3050, 44, 9 };
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			String rev = "";
			while (number != 0) {
				int s=number % 10;
				rev =rev+s;
				number = number / 10;
			}
			System.out.print(rev + " ");
		}

	}

}
