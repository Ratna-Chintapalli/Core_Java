package com.applications;

public interface Bank {
	double getBalance();
	boolean validatePIN();
	void withdrawAmount();
	void deposit();
	void changePIN();
	
}
