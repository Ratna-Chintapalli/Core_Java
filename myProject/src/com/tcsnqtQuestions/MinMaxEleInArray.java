package com.tcsnqtQuestions;

public class MinMaxEleInArray {

	public static void main(String[] args) {
		int[] arr= {3 , 4,22,1,56,45,90};
		int count=0,sum=0;
		for(int i=0;i<arr.length;i++) {
			count+=1;
			sum=sum+arr[i];
		}
		System.out.println(count);
		System.out.println(sum);
		int max=arr[0];
		int min=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
				
			
				if(arr[i]>max) {
					min=max;
					max=arr[i];
				}
				else if(arr[i]!=max && arr[i]>min ) {
					min=arr[i];
					
				}
			
			
		}
		System.out.println("Max "+max);
		System.out.println("Min : "+min);

	}

}
