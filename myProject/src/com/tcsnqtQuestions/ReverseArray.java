package com.tcsnqtQuestions;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {5,1,2,6,7,3};
		int count=0;
		int sum=0;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]%2==0) {
				count=count+arr[i];
				
			}else {
				sum=sum+arr[i];
				
			}
			//System.out.println(arr[i] + " ");
		}
		System.out.println(count + " even count ");
		System.out.println(sum+ " Odd Count ");

	}

}
