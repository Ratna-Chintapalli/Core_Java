package com.oops.abstraction;

public class CreditCardPayment extends PaymentGateway{

	@Override
	double processPayment(double amount) {
		PaymentGateway.showTransactionStatus();
  		return amount;
	}

	

}
