package com.gut;

import java.util.Scanner;

public class PasswordValidation {
	public static boolean validatePwd(String pwd) {
		boolean isUpperCase = false;
		boolean isLowerCase = false;
		boolean isSpecial = false;
		boolean isdigit = false;
		for (int i = 0; i < pwd.length(); i++) {
			char ch = pwd.charAt(i);
			if (Character.isUpperCase(ch)) {
				isUpperCase = true;
			} else if (Character.isLowerCase(ch)) {
				isLowerCase = true;
			} else if (Character.isDigit(ch)) {
				isdigit = true;
			} else if ("@#$%&!*".indexOf(ch) != -1) {
				isSpecial = true;
			}
		}
		if (!isUpperCase) {
			System.err.println("Pwd should contain UpperCase");
		}
		if (!isLowerCase) {
			System.err.println("Pwd should contain LowerCase");
		}
		if (!isdigit) {
			System.err.println("Pwd should contain digits");
		}
		if (!isSpecial) {
			System.err.println("Pwd Should contain Special Characters");
		}
		if (pwd.length() < 8) {
			System.err.println("Pwd Minimum 8 Characters ");
		}

		return pwd.length()>=8 && isUpperCase && isLowerCase && isSpecial && isdigit;

	}

	public static boolean regex(String pwd) {
		String regex="^(?=.*[A-Z])"+"(?=.*[a-z])"+"(?=.*\\d)"+"(?=.*[@#$%&!])"+"(.{8,}$)";
		return pwd.matches(regex);	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password : ");
		String pwd = sc.nextLine();
		if(validatePwd(pwd) ) {
			System.out.println("Strong Password");
		}else {
			System.out.println("Weak Password ");
		}
		if(regex(pwd)) {
			System.out.println("Valid Password");	
		}
		else {
			System.out.println("Invalid Password");
		}
	}

}
