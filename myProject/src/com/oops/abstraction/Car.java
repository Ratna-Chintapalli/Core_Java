package com.oops.abstraction;

public class Car implements Vehicle{

	@Override
	public int wheels() {
		return 4;
	}

	@Override
	public void speed() {
		System.out.println("Speed of the car is 60 ");
		
	}

	@Override
	public void accelerator() {
		 System.out.println("Car Accelerator is fully raised   ");
		
	}

//	@Override
//	public void start() {
//		System.out.println("Start the car by putting the car key ");
//		
//	}

}
