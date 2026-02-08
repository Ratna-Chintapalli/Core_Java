package com.arrays;

public class TDemo5 {

	public static void main(String[] args) {
		int[] arr= {123,12,223,2324,3,87654};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}else if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);

	}

}
