package com.pattern;

public class Pattern9 {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++){
			for(int j=6;j>i;j--) {
				System.out.print(" ");
			}
			int num=1;
			for(int k=1;k<=i;k++) {
				System.out.print(" "+num);
				num=num*(i-k)/k;
//				
			}
			System.out.println();
		}

	}

}
