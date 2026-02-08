package com.oops.abstraction;

public class Bike implements Vehicle {

	@Override
	public int wheels() {
		return 2;
	}

	@Override
	public void speed() {
		System.out.println("Speed of the bike is 70 ");
		
	}

	@Override
	public void accelerator() {
		System.out.println("Bike is improving the speed by raising the accelerator  ");
		
	}

}
