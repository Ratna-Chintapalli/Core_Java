package com.arrays;

public class TDemo_SelectionSort {

	public static void main(String[] args) {
		int[]  a= {50,30,40,70,2,66,22,5};
		int temp=0;
		System.out.println(" Before Selection Sort");
		for(int r:a) {
			System.out.print(r+"  ");
		}
		for(int i=0;i<a.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
				
			}
			temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
			
		}
		System.out.println();
		for(int r:a) {
			System.out.print(r+"  ");
		}

	}

}
