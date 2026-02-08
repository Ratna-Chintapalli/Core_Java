package com.constructors;

public class BankAccount {
		int accountNo;
		String holderName;
		double balance;
		String accountType;

		BankAccount() {
			this(1, "fgh", 5000, "Savings");

		}

		BankAccount(double balance, String accountType) {
			this(2, "Name", balance, accountType);
			System.out.println("*");
			System.out.println("Two Arg Constructor");

		}

		BankAccount(int accountNo, String holderName, double balance, String accountType) {
			System.out.println("*");
			this.accountNo = accountNo;
			this.holderName = holderName;
			this.balance = balance;
			this.accountType = accountType;

		}

		public static void main(String[] args) {
			BankAccount b = new BankAccount();
			b.showAccountdetails();
			BankAccount b1 = new BankAccount(6000.0, "current");
			b1.showAccountdetails();
			BankAccount b2 = new BankAccount(3, "mad", 7000, "current");
			b2.showAccountdetails();

		}

		void showAccountdetails() {

			System.out.println("Account No is :" + accountNo);
			System.out.println("holderName is : " + holderName);
			System.out.println("Balance is :" + balance);
			System.out.println("accoutntype :" + accountType);

		}


}
