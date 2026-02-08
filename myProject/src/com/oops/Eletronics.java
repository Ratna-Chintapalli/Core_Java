package com.oops;

public class Eletronics extends Product{

	public Eletronics(String productName, double originalPrice) {
		super(productName, originalPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	void display() {
		System.out.println("Product Name : "+productName);
		System.out.println("Original Price of the product is "+originalPrice);
		System.out.println("Discount Price of the product is "+applydiscount(originalPrice));
		
		
	}

	@Override
	public double applydiscount(double price) {
		// 10% discount 
		return price * 0.90;
	}

}
