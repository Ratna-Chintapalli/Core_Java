package com.java8features;

//Lambda Expression vs Anonymous Inner Classes 

interface TestIn8 {
	void show();
}

public class TestJava8F9 {

	public static void main(String[] args) {
		TestIn8 t = () -> {

			System.out.println("Inner Classes ");;

		};
		t.show();
	}

}
