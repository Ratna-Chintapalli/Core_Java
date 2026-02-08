package com.oops;

public class DriverEC {
	public static void main(String[] args) {
	    // Create products
		Discountable laptop = new Eletronics("Laptop", 50000);
	    Clothing shirt = new Clothing("Shirt", 2000);
	    Eletronics phone = new Eletronics("Smartphone", 30000);
	    Clothing jeans = new Clothing("Jeans", 1500);

	    // Create order and add products
	    Order order = new Order();
	    order.addProduct((Product) laptop);
	    order.addProduct(shirt);
	    order.addProduct(phone);
	    order.addProduct(jeans);

	    // Display invoice
	    order.showInvoice();
	}

}
