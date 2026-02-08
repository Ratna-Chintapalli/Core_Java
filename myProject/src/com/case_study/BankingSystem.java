package com.case_study;

class Bank{
	double accountNo;
	double balance;
	double interestRate;
	/*Bank(){
		this(0,0.0);
	} */
	Bank(double accountNo,double balance){
		this.accountNo=accountNo;
		this.balance=balance;
	}
		
}
public class BankingSystem extends Bank {
	BankingSystem(){
		this(0,0.0,0.0);
	}
	BankingSystem(double accountNo,double balance,double interestRate){
		super(accountNo,balance);
		this.interestRate=interestRate;
	}
	public static void main(String[] args) {
		BankingSystem b=new BankingSystem();
		b.display();  
		System.out.println("-------------");
		BankingSystem b1=new BankingSystem(12345678,50000.00,2.5);
		b1.display();	
	}
	void display() {
		System.out.println("Acount No :" +accountNo);
		System.out.println("Balance : "+balance);
		System.out.println("Interest Rate :"+interestRate);
	}

}