package com.oops;
class Vehicle{
	String type;
	Scooty s; // reference object 
	public Vehicle(String type, Scooty s) {
		super();
		this.type = type;
		this.s = s;
	}
	public Vehicle(Vehicle parent) {
		this.type=parent.type;
		this.s=new Scooty(parent.s.color);//Deep Copy
	}
	
	void show() {
		System.out.println("Vehicle Type : "+type);
		System.out.println("Vehicle Color : "+s.color);
	}
}
class Scooty{
	String color;
	public Scooty(String color) {
		this.color = color;
	}
	
}
public class DeepCopy {

	public static void main(String[] args) {
		Scooty sc=new Scooty("White");
		Vehicle parent=new Vehicle("Scooty",sc);
		parent.show();
		System.out.println("**********");
		Vehicle son =new Vehicle(parent);
		son.s.color="Blue";
		//System.out.println("son");
		son.show();
		
		System.out.println();
		parent.show();
		
	

	}

}
