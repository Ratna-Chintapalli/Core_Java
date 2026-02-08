package com.oops.abstraction;

public class Truck implements Vehicle{
	public int wheels() {
		return 4;
	}
	public void speed() {
		System.out.println("Speed of the truck is 70 ");
	}
	public void accelerator() {
		System.out.println("Improve the speed by raising the accelerator ");
	}

}
