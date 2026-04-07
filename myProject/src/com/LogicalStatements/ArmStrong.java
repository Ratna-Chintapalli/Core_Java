package com.LogicalStatements;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int OriginalNum = num;
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (OriginalNum == sum) {
			System.out.println("Arm strong");
		} else {
			System.out.println("not Arm strong");

		}

	}

}
