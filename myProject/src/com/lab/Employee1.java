package com.lab;

public class Employee1 {
	String ename;
	boolean hasAccessCard;
	boolean biometricMatch;
	boolean isBlackListed;
	boolean doorHasPower;
	

	Employee1(String ename, boolean hasAccessCard, boolean biometricMatch, boolean isBlackListed,
			boolean doorHasPower) {
		this.ename = ename;
		this.hasAccessCard = hasAccessCard;
		this.biometricMatch = biometricMatch;
		this.isBlackListed = isBlackListed;
		this.doorHasPower = doorHasPower;
	}


	public static void main(String[] args) {
		Employee1 e=new Employee1("abc",true,true,true,true);
		e.display();

	}
	boolean canAccess() {
		boolean a=hasAccessCard & biometricMatch & !isBlackListed & doorHasPower;
		return a;
		
	}
	void display() {
		System.out.println("Ename is :" +ename);
		System.out.println("access "+canAccess());
	}

}