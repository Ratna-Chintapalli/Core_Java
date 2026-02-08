package com.java8features;
@FunctionalInterface
interface TestIn4{
	int multiplication(int a,int b);
	
}

public class TestJava8F4 {

	public static void main(String[] args) {
		//TestIn4 t=(int a,int b)->{
		TestIn4 t=(x,y)->{
			return x*y;
		};
		System.out.println(t.multiplication(10,20));
	}

}
