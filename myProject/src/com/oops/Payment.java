package com.oops;
import java.rmi.server.UID;
import java.util.Scanner;
public class Payment {
	//int balance;
	//String accountNo;

	void pay(int amount) {
		System.out.println(amount);
	}

}
class CreditCard extends Payment {
	String cardNo;

	public CreditCard(String cardNo) {
		this.cardNo=cardNo;
  	}
	@Override
	void pay(int amount) {
		System.out.println(amount);
	}

}
class DebitCard extends Payment {
	String card;

	DebitCard(String card) {
		this.card = card;
	}
	@Override
	void pay(int amount) {
		System.out.println();
	}

}
class UPI extends Payment {
	String upi;

	UPI(String upi) {
		this.upi = upi;
	}
	@Override
	void pay(int amount) {
		System.out.println(amount);
	}
}
class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment p = null;
		System.out.println("enter ur amount");
		int amount = sc.nextInt();
		if (amount <= 0) {
			System.out.println("invalid");
		} else {
			System.out.println("press 1 for CreditCard");
			System.out.println("press 2 for DebitCard");
			System.out.println("press 3 for UPI");
			System.out.println("Enter You Choice ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 -> p = new CreditCard("QWE12345");
			case 2 -> p = new DebitCard("De12345");
			case 3 -> p = new UPI("996796@ybl");
			default -> System.out.println("invalid choice");
			}
		}
		p.pay(amount);
	}
}
