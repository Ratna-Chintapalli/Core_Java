package com.oops;

import java.util.Scanner;

//child class/cub class/derived class
public class PersonalLoan extends LoanImplementation {

	public static void main(String[] args) {

		System.out.println("💼 Welcome to Personal Loan Banking");
		PersonalLoan pl = new PersonalLoan();

		try {
			// input & validation
			double salary = pl.getCustomerSal();
			int cibil = pl.getCibilScore();
			boolean isValidCust = pl.isAadharAndPanValid();

			if (salary >= 800000 && cibil >= 750 && isValidCust) {

				// Multi-threading simulation
				LoanProcessThread t1 = new LoanProcessThread("Personal Loan Document Verification");
				LoanProcessThread t2 = new LoanProcessThread("Personal Loan Approval Process");

				t1.start();
				t2.start();

				t1.join();
				t2.join();

				System.out.println("🎉 Congratulations! Your Personal Loan Approved!");
				System.out.println("Current ROI of Personal Loan: " + pl.getROI());

				System.out.println("Please enter your address details:");
				String address = pl.getAddressDetails();
				System.out.println("Your entered address:\n" + address);

			} else {
				System.out.println("❌ Loan Rejected due to eligibility criteria");
			}

		} catch (InvalidSalaryException | InvalidCibilScoreException e) {
			System.out.println(e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("⚠ Loan processing interrupted");
		}
	}

}
