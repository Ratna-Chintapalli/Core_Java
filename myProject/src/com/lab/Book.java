package com.lab;

public class Book {
	int Bookid;
	String Title;
	String Author;
	double price;
	double discountpercentage;
	

	public static void main(String[] args) {
		Book b=new Book();
		b.Bookid=1;
		b.Title="AAA";
		b.Author="Rams";
		b.price=500;
		b.discountpercentage=10;
		double discount_amount=(b.price*b.discountpercentage)/100;
		double final_amount=b.price-discount_amount;
		System.out.println("Book Id :"+b.Bookid);
		System.out.println("Title :"+b.Title);
		System.out.println("Author :"+b.Author);
		System.out.println("Price : "+b.price);
		System.out.println("Discountpercentage : "+b.discountpercentage);
		System.out.println("discount_amount :"+discount_amount);
		System.out.println("final_amount :" +final_amount);
		

	}

}