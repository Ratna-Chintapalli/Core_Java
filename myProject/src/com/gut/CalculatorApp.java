package com.gut;

import java.util.Scanner;

public class CalculatorApp {
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	static int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	static int division(int a, int b) {
		
		if (b == 0) {
			System.out.println("Division is Not Possible");

		}
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			
			System.out.println("Enter a value : ");
			int a = sc.nextInt();
			System.out.println("Enter b value : ");
			int b = sc.nextInt();
			System.out.println("Enter Your Choice 1.Add  2. Subtraction  3.Multiplication   4.Division ");
			int choice = sc.nextInt();
			int result = 0;
			switch (choice) {
			case 1: {
				result = add(a, b);
				System.out.println(result);

				break;
			}
			case 2: {
				result = sub(a, b);
				System.out.println(result);
				break;
			}
			case 3: {
				result = mul(a, b);
				System.out.println(result);
				break;
			}
			case 4: {
				result = division(a, b);
				System.out.println(result);
				break;
			}
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Are you wanna continue if yes press y/n ");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

}
