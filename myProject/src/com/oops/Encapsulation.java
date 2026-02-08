package com.oops;

public class Encapsulation {
	private String accountHolderName;
	private String accountNo;
	private double balance;
	public Encapsulation(String accountHolderName,String accountNo, double balance) {
		this.accountHolderName=accountHolderName;
		this.accountNo = accountNo;
		if(balance<0) {
			this.balance = balance;
		}else {
			this.balance=0;
		}
		
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			this.balance +=amount;
			System.out.println("Deposited "+amount+ "     New Balance: "+this.balance);
		}else {
			System.out.println("Deposit amount  must be positive .");
		}
	}
	//setter/mutator for withdrawal with validation 
	public void withdraw(double amount) {
		if(amount>0 && this.balance>=amount) {
			this.balance-=amount;
			System.out.println("Withdraw" +amount+"  New Balance :"+this.balance);
		}else {
			System.out.println("Invalid Withdraw amount or insufficient balance.");
		}
	}
}
