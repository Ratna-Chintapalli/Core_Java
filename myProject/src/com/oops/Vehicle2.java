package com.oops;
class Vehicle6{	
	int rent(int hours) {
		return 0;
	}
}
class Car3 extends Vehicle6{
	@Override
	int rent(int hours) {
		return hours*100;
	}
}
class Bike3 extends Vehicle6{
	@Override
	int rent(int hours) {
		return hours*50;
	}
}
public class Vehicle2 {
	public static void main(String[] args) {
		Vehicle6 car=new Car3();
		int a=car.rent(100);
		System.out.println(a);
		Vehicle6 bike=new Bike3();
		int b=bike.rent(50);
		System.out.println(b);

	}

}
