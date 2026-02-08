package com.java8features;
@FunctionalInterface
interface TestIn1{
	void hello();
}
class TestDemo1 implements TestIn1{
	@Override
	public void hello() {
		System.out.println("java8 is very very simple");
		
	}
	
}

public class TestJava8F1 {

	public static void main(String[] args) {
		System.out.println("Java8  features ");
		TestDemo1 t1=new TestDemo1();
		t1.hello();

	}

}
