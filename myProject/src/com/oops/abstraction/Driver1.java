package com.oops.abstraction;

public class Driver1 {

	public static void main(String[] args) {
		PaymentGateway creditcard=new CreditCardPayment();
		System.out.println("Credit card "+creditcard.processPayment(20000.00));
//		Driver1.showTransactionStatus();
		
		PaymentGateway  upi=new UPIPayment();
		System.out.println("UPI transaction "+upi.processPayment(30000.00));
//		Driver1.showTransactionStatus();
	}

}
