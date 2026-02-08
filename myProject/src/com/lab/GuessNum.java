package com.lab;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int n=rd.nextInt(10)+1;
		System.out.println(n);
		
		for(int i=0;i<=3;i++) {
			System.out.println("enter a number");
			int n1=sc.nextInt();
			if(n1==n) {
				System.out.println("you won");
				break;
			}
			else {
				System.out.println("you have"+(3-i)+"more chances");
			}
		}
		

	}

}
