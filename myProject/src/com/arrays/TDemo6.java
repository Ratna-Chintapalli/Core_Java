package com.arrays;

public class TDemo6 {

	public static void main(String[] args) {
		int[] arr= {16, 17, 4, 3, 5, 2};
		int max=arr[0];
		for (int i=0;i<arr.length;i++) {
			int number = arr[i];
			while (number!=0) {
				int j=0;
				for(j=0;j<arr.length;j++) {
					if(max<arr[j]) {
						max=arr[j];
						
					}
					
				}
				System.out.println(arr[j]);
				
			}
		}
		

	}

}
