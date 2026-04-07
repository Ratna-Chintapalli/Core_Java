package com.tcsnqtQuestions;

import java.util.Scanner;

public class FraudTransaction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		String r[]=new String[n];
		double a[]=new double[n];
		long t[]=new long[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.next();
			r[i]=sc.next();
			a[i]=sc.nextDouble();
			t[i]=sc.nextLong();
		}
		for(int i = 0; i < n; i++) {
		    for(int j = i + 1; j < n; j++) {   // 🔥 change here

		        if ((t[i] - t[j]) <= 60) {   // 🔥 correct condition

		            if(s[i].equals(s[j]) && r[i].equals(r[j]) && a[i] == a[j]) {
		                System.out.println(s[i] + " " + r[i] + " " + a[i] + " " + t[i]);
		                break;   // 🔥 avoid multiple prints
		            }

		        }
		    }
		}
		

	}

}
