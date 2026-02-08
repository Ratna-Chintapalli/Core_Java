package com.arrays;
public class MoveZerosToEnd {
//✔ Uses constant space O(1)
//✔ Runs only one pass through array ≈ O(n)
	public static void main(String[] args) {
		int[] arr = {1, 0, 3, 0, 5,9,0};
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[k]=arr[i];
				k++;
			}
		}
		while(k<arr.length) {
			arr[k]=0;
			k++;
		}
		for(int x:arr) {
			System.out.print(x+"  ");
		}
		
		
		
		
		
		
		
		
		
//        int k = 0; // index to place next non-zero element
//        // Step 1: Move all non-zero elements to front
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[k] = arr[i];
//                k++;
//            }
//        }
//        // Step 2: Fill remaining positions with zeros
//        while (k < arr.length) {
//            arr[k] = 0;
//            k++;
//        }
//        // Print result
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }
	}
}
