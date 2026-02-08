package com.oops.abstraction;

public class UPIPayment extends PaymentGateway{

	@Override
	double processPayment(double amount) {
		// TODO Auto-generated method stub	
		PaymentGateway.showTransactionStatus();

		return amount;
	}

}
