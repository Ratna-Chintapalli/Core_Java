package com.operators;
import java.util.*;

public class Shift_operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a=sc.nextInt();
		System.out.println("Enter b value :");
		int b=sc.nextInt();
		System.out.println(a>>b);//40
		System.out.println(a<<b);//2600

	}

}