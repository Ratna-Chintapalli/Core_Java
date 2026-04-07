 package com.tcsnqtQuestions;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {5,1,2,6,7,3};
		int temp=0;
		int j=0;
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];//1
			j=i;//1
			while(j>0 && arr[j-1]>temp){
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		for(int a:arr) {
			System.out.println(a+" ");
		}

	}

}
