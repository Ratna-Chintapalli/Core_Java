package com.oops.abstraction;

public class Cycle implements Vehicle{

	@Override
	public int wheels() {
		return 2;
	}

	@Override
	public void speed() {
		System.out.println("THe speed of the cycle is based on our energy ");
		
	}

	@Override
	public void accelerator() {
		System.out.println("Here we don't have any accelarator, we need to improve cycling ");
		
	}
	@Override
	public void start() {
		System.out.println("Cycle can start without key ");
	}

	
}
