
package com.oops.abstraction;

abstract class PaymentGateway {
	abstract double processPayment(double amount);
	static void showTransactionStatus(){
		System.out.println("Transaction completed successfully ");
	}

}
