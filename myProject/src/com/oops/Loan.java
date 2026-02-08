package com.oops;

public interface Loan {
	public String getAddressDetails();
	public int getCibilScore() throws InvalidCibilScoreException;
	public double getROI();
	public boolean isAadharAndPanValid();
	public double getCustomerSal() throws InvalidSalaryException ;

}
