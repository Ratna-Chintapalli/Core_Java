package com.oops;

public abstract class Product implements Discountable {
	public String productName=" ";
	public double originalPrice;
	public Product(String productName, double originalPrice) {
        this.productName = productName;
        this.originalPrice = originalPrice;
    }
	String getName() {
		return productName;
	}
	double getPrice() {
		return originalPrice;
	}
	abstract void display();

}
