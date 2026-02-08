package com.practice;

public class LargestInArray {

	public static void main(String[] args) {
		int[] arr= {10,45,20,90,5};
		int max=0;
		for(int a:arr) {
			if(max<a) {
				max=a;
			}
			
		}
		System.out.println(max);

	}

}
