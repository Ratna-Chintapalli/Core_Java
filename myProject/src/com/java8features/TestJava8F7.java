package com.java8features;

//Lambda Expression vs Inheritance
@FunctionalInterface
interface TestIn6{
	void method6();
}
@FunctionalInterface
interface TestIn7 extends TestIn6{
//	void method7();
}

public class TestJava8F7 {

	public static void main(String[] args) {
//		TestIn6 t=()->{
//			System.out.println("hello");
//		};
//		t.method6();
	}

}
