package com.LogicalStatements;

import java.util.Scanner;

public class PerfOrNot {
	static boolean isPerfect(int num) {
		boolean status = false;
		int sum = 0;
		for(int i= 1;i<=num/2;i++) {
			if(num % i==0) {
				sum = sum + i;
			}
		}
		if (sum ==num) {
			status = true;
		}
		
		return status;
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check factors : ");
		int n= sc.nextInt();
		boolean status = isPerfect(n);
		if(status) {
			System.out.println("given number is perfect");
		} else {
			System.out.println("given number is not perfect");
		}
		

	}

}
