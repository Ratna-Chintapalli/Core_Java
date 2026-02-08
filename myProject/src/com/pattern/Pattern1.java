package com.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==4 && j==4) {
					System.out.print("hlo");
				}else if(i==j||i+j==7+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
