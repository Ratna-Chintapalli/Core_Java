package com.operators;
import java.util.*;

public class Ternary2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		System.out.println("Enter country :");
		String nationality=sc.next();
		String eligibility="";
		eligibility=(age>18)&&(nationality.equals("india"))? "Yes ur eligilbe " : "No ur not eligible ";
		System.out.println(eligibility );
		

	}

}



