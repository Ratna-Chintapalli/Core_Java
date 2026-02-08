package com.practice;

public class SecondLargestEle {

	public static void main(String[] args) {
		int[] arr= {10,5,20,8};
		int first=0;
		int second=0;
		for(int i:arr) {
			if(first<i) {//0<10 --> sec=10, 10
				second=first;
				first=i;
				
			}
			
		}
		System.out.println(first);
		System.out.println(second);

	}

}
