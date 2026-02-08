package com.java8features;
interface TestIn3{
	int addition();
}

	


public class TestJava8F3 {

	public static void main(String[] args) {
		TestIn3 t=()->{
			int a=100;
			int b=200;
			int c=a+b;
			return c;
		};
		System.out.println(t.addition());
	}

}
