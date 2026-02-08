package com.oops.abstraction;

public class Driver {

	public static void main(String[] args) {
		System.out.println("********* Car Related Information*******");
		Vehicle car=new Car();
		System.out.println(car.wheels());
		car.speed();
		car.accelerator();
		car.start();
		
	    // we can access the static methods in interfaces using interface name only......
		Vehicle.serviceInfo();
		
		System.out.println("******** Bike Related Information ********");
		Vehicle bike=new Bike();
		System.out.println(bike.wheels());
		bike.speed();
		bike.accelerator();
		bike.start();
		Vehicle.serviceInfo();
		
		
		System.out.println("---------- Cycle Related Information --------");
		Vehicle cycle=new Cycle();
		System.out.println(cycle.wheels());
		cycle.speed();
		cycle.accelerator();
		
		// we can override the default methods 
		cycle.start();
		Vehicle.serviceInfo();
		
		
		System.out.println("--------Truck Related Information --------");
		Vehicle t=new Truck();
		System.out.println(t.wheels());
		t.speed();
		t.accelerator();
		t.start();
		Vehicle.serviceInfo();
		
		
		

	}

}
