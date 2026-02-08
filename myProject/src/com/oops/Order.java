package com.oops;

import java.util.ArrayList;
import java.util.List;

public class Order {
	 private List<Product> products = new ArrayList<>();

	    public void addProduct(Product p) {
	        products.add(p);
	    }

	    public void showInvoice() {
	        double total = 0;
	        System.out.println("\n Order Invoice:");
	        System.out.println("------------------------");

	        for (Product p : products) {
	            p.display();  // Calls each product’s display() (polymorphism)
	            total += p.applydiscount(p.getPrice());
	        }

	        System.out.println("------------------------");
	        System.out.println("Total Amount Payable: ₹" + total);
	    }

}
