package com.oops;
import java.util.Scanner;
public class MOLArea {
	static double findArea(int l,int b) {
		return l*b;
	}
	static double findArea(int s) {
		return s*s;
	}
	static double findArea(float r) {
		return Math.PI*r*r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("ENter Length : ");
		int length=sc.nextInt();
		System.out.println("Enter Breadth : ");
		int breadth=sc.nextInt();
		System.out.println("Area of Rectangle is : "+findArea(length,breadth));
		System.out.println("Enter Side :");
		int side=sc.nextInt();
		System.out.println("Arear of the Square is :  " +findArea(side));
		System.out.println("Enter radius : ");
		int radius=sc.nextInt();
		System.out.println("Area of the circle is : "+findArea(radius));

	}

}
