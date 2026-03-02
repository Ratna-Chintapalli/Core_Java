package com.gut;

import java.util.Scanner;

public class StudentGradeSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name = sc.next();
		System.out.println("Enter how many Subjects : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Each Subject marks : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int marks = 0;
		for (int i = 0; i < arr.length; i++) {

			marks = marks + arr[i];
		}
		System.out.println();
		System.out.println("Total marks : " + marks);
		double percentage = marks / n;
		System.out.println("percentage : " + percentage + "%");
		if (percentage >= 90) {
			System.out.println("Grade : A");
		} else if (percentage >= 75 && percentage <= 89) {
			System.out.println("Grade : B");
		} else if (percentage >= 60 && percentage <= 74) {
			System.out.println("Grade : C");
		} else if (percentage >= 50 && percentage <= 59) {
			System.out.println("Grade : D");
		} else {
			System.out.println("Fail");
		}

	}

}
