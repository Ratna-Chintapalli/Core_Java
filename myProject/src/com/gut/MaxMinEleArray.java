package com.gut;

public class MaxMinEleArray {

	public static void main(String[] args) {

		int[] arr= {10,45,20,8,45,30};
		int max=arr[0];
		//int second=max;
		int min=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];//45
//				second=max;//45
//				if(second<max) {
//					second=max;
//				}
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
		//System.out.println("Second Largest : "+second);

	}

}
