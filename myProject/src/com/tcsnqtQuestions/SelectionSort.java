package com.tcsnqtQuestions;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println();
//		int temp=0;
//		for(int i=0;i<arr.length-1;i++) {
//			int minIndex=i;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j]<arr[minIndex]) {
//					minIndex=j;
//				}
//			}
//			temp=arr[i];
//			arr[i]=arr[minIndex];
//			arr[minIndex]=temp;
//			
//		}
		int t;
		boolean swapped;
		for(int i=0;i<arr.length-1;i++) {
			swapped=false;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j+1]<arr[j]) {
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					swapped=true;
				}
				
			}
			if(!swapped) {
				break;
			}
		}
		for(int r:arr) {
			System.out.println(r);
		}
		
		

	}

}
