package com.pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number ");
//		int n=sc.nextInt();
//		int max=0;
//		while (n>0) {
//			int r=n%10;
//			//System.out.println(r);
//			if(r>max) {
//				max=r;	
//			}
//			n=n/10;
//			
//		}
//		System.out.println("max:"+max);
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=5;j++) {
				if( i==4||j==3) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
