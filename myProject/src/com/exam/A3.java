package com.exam;
//after return statements u won't write anything if u write it will show Compile time error
//CE: Unreachable code
public class A3 {
	int addition(int a,int b) {
		return a+b;
		//System.out.println("Hello");
	}

	public static void main(String[] args) {
		A3 a=new A3();
		a.addition(2,3);

	}

}