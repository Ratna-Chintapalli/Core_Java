package com.stringhandling;

class A1{
	static String msg="Hello";
	static {
		msg="Hi";
	}
}
class B1 extends A1{
	static {
		msg="bye";
	}
}


public class Test5 {

	public static void main(String[] args) {
		System.out.println(B1.msg); //Hi
		
	//	System.out.println(msg);
/*
 * msg is not defined in Test5, It belongs to class A1
 * Java does not allow unqualified access to static members of another class
 */
		
		System.out.println(A1.msg); //Hi

	}

}
