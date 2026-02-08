package com.LogicalStatements;

public class PrimeNumbersUsingMethods {
	static boolean isPrime(int n) {
		boolean status = true;
		if(n==1) {
			return false;
		}
		else {
			for(int i =2;i<n;i++) {
				if(n%i==0) {
					status=false;
					break;
				}
			}
		}
			return status;
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		for (int i=100;i<=200;i++){
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		

	}
}
