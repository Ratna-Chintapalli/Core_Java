package com.oops;

import java.util.Scanner;

public class LoanImplementation implements Loan {
	static Scanner sc = new Scanner(System.in);

	@Override
	public String getAddressDetails() {
		System.out.println("Enter your flat No:");
		String flat = sc.next();

		System.out.println("Enter your Plot No:");
		String plot = sc.next();

		System.out.println("Enter your Street:");
		String street = sc.next();

		System.out.println("Enter your City:");
		String city = sc.next();

		System.out.println("Enter your PIN Code:");
		long pin = sc.nextLong();

		return "Flat: " + flat + ", Plot: " + plot + ", Street: " + street +
			   ", City: " + city + ", PIN: " + pin;
	}

	@Override
	public int getCibilScore() throws InvalidCibilScoreException {
		System.out.println("Enter your CIBIL Score:");
		int cibil = sc.nextInt();

		if (cibil < 300 || cibil > 900) {
			throw new InvalidCibilScoreException("❌ Invalid CIBIL Score! Must be between 300 and 900.");
		}
		return cibil;
	}

	@Override
	public double getROI() {
		return 9.5;
	}

	@Override
	public boolean isAadharAndPanValid() {
		System.out.println("Enter Aadhar Number:");
		String aadhar = sc.next();

		if (!aadhar.matches("\\d{12}")) {
			System.out.println("❌ Invalid Aadhar Number!");
			return false;
		}

		System.out.println("Enter PAN Number:");
		String pan = sc.next();

		if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
			System.out.println("❌ Invalid PAN Number!");
			return false;
		}

		return true;
	}

	@Override
	public double getCustomerSal() throws InvalidSalaryException {
		System.out.println("Enter your salary:");
		double salary = sc.nextDouble();

		if (salary <= 0) {
			throw new InvalidSalaryException("❌ Salary cannot be zero or negative!");
		}
		return salary;
	}
}
