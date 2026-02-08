package com.stringhandling;

 abstract class A{
	A(){
		System.out.println("A");
	}
	abstract void callMe();
}
class B extends A{
	int x=5;
	void callMe() {
		System.out.println(x);
	}
}
/*
 * Abstract classes can have constructors, 
 * and they are executed when a subclass object is created. 
 * The parent constructor runs before the child constructor.
 * 
 * 
 * 
 * o/p: Exception
 */
public class Test4 {

	public static void main(String[] args) {
		A obj=new B();

	}

}
