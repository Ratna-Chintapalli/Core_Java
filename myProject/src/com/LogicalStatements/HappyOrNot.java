package com.LogicalStatements;

import java.util.Scanner;

public class HappyOrNot {
	static int happy(int n) {
		int sum=0;
		while(n!=0) {
			int r= n%10;//9
			n=n/10;//1
			sum=sum+r*r;//81	
		}
		return sum;
		
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n = sc.nextInt();
		int sum1=happy(n);
		boolean stop=false;
		while(!stop) {
			if(sum1==1) {
				System.out.println("Happy No " +n);
				stop=true;
			}else if(sum1==4) {
				System.out.println("Not a happy No "+n);
				
				stop=true;
			}else {
				sum1=happy(sum1);
			}
		}


	}


}
