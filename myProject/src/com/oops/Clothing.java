package com.oops;

public class Clothing extends Product{


	public Clothing(String productName, double originalPrice) {
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
		// 20% discount for clothing
        return price * 0.80;
	}

	

}
