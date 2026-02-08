package com.LogicalStatements;

import java.util.Scanner;

public class PrimeAlphaPosition {
	static boolean isPrime(int n) {
		boolean prime=true;
		if(n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime=false;
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//int n=sc.nextInt();
		
		for(int n=1;n<=26;n++) {
			if(isPrime(n)) {
				int ch=n+64;
				System.out.println((char)ch);
			}else {
				System.out.println(n);
			}
		}
		

	}

}
