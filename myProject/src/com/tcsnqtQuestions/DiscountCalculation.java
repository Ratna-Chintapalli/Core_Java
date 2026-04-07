package com.tcsnqtQuestions;
import java.util.*;

public class DiscountCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		if(amount<=1000) {
			amount=amount-(amount/100)*5;
			System.out.println(amount);
		}else if(amount>1000 && amount<=5000) {
			amount=amount-(amount/100)*10;
			System.out.println(amount);
		}else {
			amount=amount-(amount/100)*15;
			System.out.println((int)amount);
		}

	}

}
