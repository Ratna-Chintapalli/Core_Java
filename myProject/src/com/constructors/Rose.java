package com.constructors;

public class Rose {
	int color;
	int count;
	String flower = "Rose";

	Rose() {
		System.out.println("*");
		// System.out.println(this.flower);
		System.out.println("No arg constructor from Rose");
	}

	public static void main(String[] args) {
		// Rose r=new Rose();

	}

}

class Lotus extends Rose {
	String flower = "Lotus";

	Lotus() {
		System.out.println(super.flower);
		System.out.println(this.flower);
	}

	public static void main(String[] args) {
		 Lotus l=new Lotus();

	}
}
