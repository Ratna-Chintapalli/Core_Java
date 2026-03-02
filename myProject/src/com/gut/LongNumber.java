package com.gut;

import java.util.Scanner;

public class LongNumber {
	public static String removeOnes(String s) {
		String max="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
				String temp=s.substring(0,i)+s.substring(i+1);
				System.out.println("Posssible outcomes are :  "+temp);
				if(max.equals("")||temp.compareTo(max)>0) {
					max=temp;
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		String s="1332134124";
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter n value : ");
//		int n=sc.nextInt();
		int n=1;
		System.out.println("Biggest Number is : "+removeOnes(s));

	}

}
