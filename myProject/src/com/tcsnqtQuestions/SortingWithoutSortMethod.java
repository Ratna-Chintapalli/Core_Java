package com.tcsnqtQuestions;

public class SortingWithoutSortMethod {

	public static void main(String[] args) {
		int[] arr= {5,1,2,6,7,3};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
//				Sorting  
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(int a:arr) {
			System.out.println(a);
		}

	}

}
