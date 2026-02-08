package com.pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n-2;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i+j==n+1) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=n-3;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(i==j || i+j==n+1) {
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
