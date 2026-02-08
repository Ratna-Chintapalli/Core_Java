package com.stringhandling;

public class Test2 {
	/*
	 * When null is passed to overloaded methods,
	 *  Java selects the method with the most specific parameter type. 
	 * Since String is more specific than Object, method(String) is called.
	 */
//If multiple overloaded methods match, Java chooses the most specific one.
	//means first it matches the match if string is not there it will go to the object
	void method(Object o) {
		System.out.println("Object");
	}
	void method(String s) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		Test2 t=new Test2();
		t.method(null); // o/p: String
		

	}

}
