package com.lab;
import java.util.Scanner;
public class AirLineTicketFare {
	
	static double discount=0;
	static int charges;
	public static void main(String[] args) {
		AirLineTicketFare a=new AirLineTicketFare();
		double baseFare=5000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter days : ");
		int days=sc.nextInt();
		double  price=baseFare;
		double finalPrice=0.0;
		if(days>=30) {
			price-=(baseFare*0.20);
			System.out.println("grater than 30 days:"+price);	
			System.out.println("Enter age : ");
			int age=sc.nextInt();
			if(age<=12) {
				price -=(baseFare*0.10);
				System.out.println(price);				
			}
			else if(age>60) {
				price-=(baseFare*0.15);
				System.out.println(price);		
			}
		}else if(days<=7) {
			price=baseFare+(baseFare*0.25);
			System.out.println("7 days before: "+price);
			System.out.println("Is it weekend : ");
			boolean isWeekend=sc.nextBoolean();
			if(isWeekend ) {
				price= (baseFare+(baseFare*0.30));
				System.out.println("price on weekend:"+price);
			}
		}
		else {
				System.out.println("No  Charges ");
		}
	}
}