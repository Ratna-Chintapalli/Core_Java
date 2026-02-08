package com.arrays;

public class TDemo8 {

	public static void main(String[] args) {
		int[] array = { 12, 3050, 44, 9 };
		int sum=0;
		int avg=0;
		for (int i=array.length-1;i>=0;i--) {
			sum=sum+array[i];
		}
		
		avg=sum/array.length;
		System.out.println(sum);
		System.out.println(avg);

	}

}
