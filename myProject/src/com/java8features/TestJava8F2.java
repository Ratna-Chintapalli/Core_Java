package com.java8features;

@FunctionalInterface
interface TestIn2{
	void hello();
}

public class TestJava8F2 {

	public static void main(String[] args) {
		TestIn2 t1= ()->{
			System.out.println("Java 8 Features ");
		};
		t1.hello();
	}

}
