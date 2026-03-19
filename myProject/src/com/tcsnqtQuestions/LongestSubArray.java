package com.tcsnqtQuestions;

import java.util.*;

public class LongestSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter Array Length : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int max=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int a:arr) {
			System.out.print(a+ " ");
		}
		
		System.out.println("Enter k value : ");
		int k=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			int sum=arr[i];
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				sum=sum+arr[j];
				count++;
				if(sum==k) {
					//System.out.println(sum);
					if(max<count)max=count;
				}
			}
			
		}
		System.out.println(max);
	}

}
