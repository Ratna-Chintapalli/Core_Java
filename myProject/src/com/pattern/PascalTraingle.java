package com.pattern;

public class PascalTraingle {
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
			System.out.print(" ");
			}
			int num=1;
			for(int k=0;k<=i;k++){
				System.out.print(num +" ");
				num = num*(i-k)/(k+1);
			}
			
		System.out.println();
		}
	}
}
