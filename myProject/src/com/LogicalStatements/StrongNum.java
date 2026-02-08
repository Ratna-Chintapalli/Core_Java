package com.LogicalStatements;

import java.util.Scanner;

public class StrongNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int n1=n;
		int sum=0;
		while(n!=0) {
			int r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
				
			}
			sum=sum+fact;
			n=n/10;
		}
		if(n1==sum) {
			

			System.out.println(n1+"is strong number");
		}else {
			System.out.println(n1+"is not strong number");
		}
		
		
	

	}

}
