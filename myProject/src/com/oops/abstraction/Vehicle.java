package com.oops.abstraction;

public interface Vehicle {
	String name="Ratna";
	public abstract int wheels();
	public abstract void speed();
	void accelerator();
	
	//default methods can be overridden by implementing classes.
	//Default methods help in backward compatibility — you can add new features to interfaces without breaking old code.
	public default void start(){
		message("Ratna");
		System.out.println("Every Vehicle is started whenever we put the key.....");
	}
	
	//static methods cannot be overridden and are called using the interface name.
	public static void serviceInfo() {
		System.out.println("Every Vehicle need servicing after 6 months......");
	}

	// private methods → used inside the interface only.
	//private static methods → can be used inside static or default methods
	//Suppose you have multiple default methods sharing some common logic.
	//Instead of repeating that code, you can extract it into a private method inside the interface.
	// Private instance method (only used inside interface)
    private void message(String msg) {
        System.out.println("Drive Vehicles safely  " + msg);
    }
}
