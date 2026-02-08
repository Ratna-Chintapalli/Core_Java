package com.constructors;

public class Vehicle {
	// if u have parameterized constructor in parent class then u cannot 
	//create a default constructor in child class
	
	// the child class calls the no-arg or default constructor from parent class 
	//if u don't have parameterized constructor in parent class
	
	// when u have a parameterized constructor in ur class then 
	//u must have no-arg constructor in parent class
	String color;
	double price;
	String brand;
	Vehicle(){
		System.out.println("No arg constructor from Vehicle Parent class");
	}
	//if u call no-arg constructor in child then the no-arg constructor in parent is not called , 
	//only one no-arg constructor is called  

	public Vehicle(String string, double price, String brand) {
		super();
		this.color = string;
		this.price = price;
		this.brand = brand;
	}


	public static void main(String[] args) {
		System.out.println("Main method from Vehicle ");
		//Vehicle v=new Vehicle();

	}

}

class Bike extends Vehicle{
	Bike(){
		super("white",2000000,"XER");

		System.out.println("No arg constructor from bike child class ");
	}
	
	public static void main(String[] args) {
		
		System.out.println( "Main method from Bike......");
		Bike b=new Bike();
		System.out.println(b.color);
		System.out.println(b.price);
		System.out.println(b.brand);
	}
}
