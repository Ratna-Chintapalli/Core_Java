package com.tcsnqtQuestions;

import java.util.Scanner;

public class BallonHotAir {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			if(!sc.hasNextInt()) {
				System.out.println("Not an Integer.");
				return;
			}
			arr[i]=sc.nextInt();
			int x=sc.nextInt();
			int sum=0,count=0;
			for(int a:arr) {
				
				if(sum+a <=a ) {
					sum+=a;
					count++;
					
				}else {
					break;
				}
			}
			System.out.println(count);
		}

	}

}
