package com.lab;

//

public class Product_1 {
	int id;
	String name;
	int price;
	int quantity;
	Product_1(){
		this(0,"Unknown",50,1);
		System.out.println("*");
		
	}
	Product_1(int id,String name){
		this(id,name,10,2);
		//this.id=id;
		//this.name=name;
		System.out.println("*");
		
	}
	Product_1(int id,String name,int price,int quantity ){
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		System.out.println("*");
	}

	public static void main(String[] args) {
		Product_1 p=new Product_1();
		p.show();
		Product_1 p1=new Product_1(2,"Known");
		p1.show();
		Product_1 p2=new Product_1(3,"Known",70,3);
		p2.show();

	}
	void show() {
		System.out.println("Id :" +id);
		System.out.println("Name :" +name);
		System.out.println("Price :" +price);
		System.out.println("quantity :" +quantity);
		
	}

}