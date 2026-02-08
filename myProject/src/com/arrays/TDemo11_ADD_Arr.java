package com.arrays;

public class TDemo11_ADD_Arr {

	public static void main(String[] args) {
//		int[] a = {10, 20, 30};
//		a[1] = a[2];
//		a[2] = a[1];
//		System.out.println(a[1] + " " + a[2]);    --> o/p: 30 30 
		
		
//		int[] a = {1, 2, 3};
//		int[] b = a;
//		b[1] = 10; 
//		System.out.println(a[1]);           -- o/p : 10 coz a and b reference the same array
		
		
//		int[] a = {1, 2, 3, 4};
//		int i = 0, j = a.length - 1;
//
//		while(i < j){
//		    a[i] = a[j];
//		    a[j] = a[i];
//		    i++; j--;
//		}
//
//		System.out.println(a[0] + " " + a[3]);          --> o/p; 4 4



		int arr[]= {10,20,30,40,50,60};
		for(int i=0;i<arr.length ;i++) {
			
			if(i==0) {
				//arr[i]=arr[i]+arr[i+1];
				System.out.print(arr[i] + arr[i + 1] +" ");
			}else if(i==arr.length-1) {
				//arr[i]=arr[i-1]+arr[i];
				System.out.print(arr[i-1]+arr[i] + " ");
				
			}else {
				//arr[i]=arr[i-1]+arr[i+1];
				System.out.print(arr[i-1]+arr[i+1]  +" ");
			}
		}

	}

}
