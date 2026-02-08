package com.LogicalStatements;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		boolean prime=true;
		if(n<=1) {
			prime=false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println("prime is:"+n);
		}
			else {
				System.out.println("is not prime:"+n);
				
			}
		sc.close();
			
		}
	

}
