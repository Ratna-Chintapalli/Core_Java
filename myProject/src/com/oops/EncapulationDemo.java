package com.oops;

public class EncapulationDemo {

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation("XYZ","123456789",1000.0);
		//cannot directly access balance=-500,due to private access
		System.out.println("Account Holder Name :"+e.getAccountHolderName());
		System.out.println("Account Number :" +e.getAccountNo());
		System.out.println("Current  Balance :"+e.getBalance());
		e.deposit(500);
		e.withdraw(200);
		e.withdraw(2000);//will fail due to insufficient balance 

	}

}
