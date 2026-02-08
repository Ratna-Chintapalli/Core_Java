package com.oops.abstraction;

public class Driver2 {

	public static void main(String[] args) {
		Employee p=new Parttime(01,"ABC",4,500);
		System.out.println(p.calculate());
		p.displaydetails();
		System.out.println();
		
		Employee f=new FullTime(02,"DEF",6,30000);
		System.out.println(f.calculate());
		f.displaydetails();
		
		

	}

}
