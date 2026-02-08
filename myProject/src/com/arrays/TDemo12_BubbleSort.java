package com.arrays;

public class TDemo12_BubbleSort {

	public static void main(String[] args) {
		int[]  a= {50,30,40,70,2,66,22,5};
		int temp=0;
		for(int r:a) {
			System.out.print(r+"  ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				//asce-->a[j+1]<a[j]    ,    desc--> a[j+1]>a[j]
				if(a[j+1]<a[j]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("After Sorting ");
		for(int r:a) {
			System.out.print(r+"  ");
		}


	}

}
