package com.LogicalStatements;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");//5
		int n= sc.nextInt();
		int square=n*n;//25
		int sum=0;
		int t=square;//25
		while(t!=0) {
			int d=t%10;
			sum+=d;//7
			t=t/10;
		}
		if(sum==n) {
			System.out.println(n+"Neon Number ");
		} else {
			System.out.println(n+"Not Neon Number");
		}

	}

}
