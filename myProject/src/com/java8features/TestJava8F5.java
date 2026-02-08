package com.java8features;

@FunctionalInterface
interface TestIn5{
	String show(String s);
}
public class TestJava8F5 {

	public static void main(String[] args) {
		TestIn5 t=(a)-> a.toUpperCase();
		System.out.println(t.show("Java8 is very very simple ."));

	}

}
