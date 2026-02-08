package com.oops;
class Vehicle1{
	String vehicleNo;
	String brand;
	double pricePerDay;
	void show() {
		System.out.println("Vehicle No is :" +vehicleNo);
		System.out.println("Vehicle Brand:" +brand);
		System.out.println("Price Per Day:" +pricePerDay);
	}
	public Vehicle1(String vehicleNo, String brand, double pricePerDay) {
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.pricePerDay = pricePerDay;
	}
	double calculateRent(int days) {
		return pricePerDay*days;
	}
	
	
	
}
class Car extends Vehicle1{
	int numberOfDoors;
	
	public Car(String vehicleNo, String brand, double pricePerDay,int numberOfDoors) {
		super(vehicleNo,brand,pricePerDay);
		this.numberOfDoors=numberOfDoors;
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("No of Doors : "+numberOfDoors);
	}
	
}
class Bike extends Vehicle1 {
	boolean helmet;
	Bike(String vehicleNo,String brand,double pricePerDay,boolean helmet){
		super(vehicleNo,brand,pricePerDay);
		this.helmet=helmet;
	}
	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("Has Helmet :"+(helmet ?"Yes":"No"));
	}
	
	
	
}
class Truck extends Vehicle1{
	String color;
	Truck(String vehicleNo,String brand,double pricePerDay,String color){
		super(vehicleNo,brand,pricePerDay);
		this.color=color;
	}
	void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("Color of the truck :" +color);
	}
	
}
public class VehicleRental {
	public static void main(String[] args) {
		Vehicle1 car=new Car("ABC123","RR",3000.00,4);
		Vehicle1 bike=new Bike("B201","HeroHonda",1000,false);
		Vehicle1 truck=new Truck("C312","Tata",2000,"red");
		
		System.out.println("**************");
		car.show();
		System.out.println("Car Rent for 3 days:"+car.calculateRent(3));
		
		System.out.println();
		bike.show();
		System.out.println("Bike Rent for 4 days:"+bike.calculateRent(4));
		
		System.out.println();
		truck.show();
		System.out.println("Truck Rent for 5 days:"+truck.calculateRent(5));
	}
	
	

}
