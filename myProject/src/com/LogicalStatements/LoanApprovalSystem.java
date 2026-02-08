package com.LogicalStatements;

import java.util.Scanner;

public class LoanApprovalSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary : ");
		double sal = sc.nextDouble();
		
		int credit_score ;
		if (sal >= 50000) {
			System.out.println("Enter Credit Score :");
			credit_score=sc.nextInt();
			if (credit_score >= 750) {
				System.out.println("Approved");

			} else if (credit_score > 500 && credit_score < 750) {
				System.out.println("Processing, You need guareentor");
			} else {
				System.out.println("rejected");
			}
		} else if (sal < 50000 && sal >= 30000) {
			System.out.println("Enter Credit Score :");
			credit_score=sc.nextInt();
			if (credit_score >= 850) {
				System.out.println("2 lack loan approved");
			} else {
				System.out.println("Rejected");
			}
		} else {
			System.out.println(" Loan Rejected");
		}

	}

}