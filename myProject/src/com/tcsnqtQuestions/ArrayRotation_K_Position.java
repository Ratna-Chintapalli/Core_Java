package com.tcsnqtQuestions;
import java.util.*;
public class ArrayRotation_K_Position {

	static void reverse(int[] arr,int start,int end) {
		int t=0;
		while(start<end) {
			t=arr[start];
			arr[start] = arr[end];
			arr[end]=t;
			start++;
			end--;
		}
	}
	static void rotateArrayRtoL(int[] arr,int r) {
		int start=0;
		int end=arr.length-1;
		
		reverse(arr,start,end);
		reverse(arr,start,r-1);
		reverse(arr,r,end);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println("Enter how many time you want to rotate array : ");
		int r=sc.nextInt();
		rotateArrayRtoL(arr,r);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
