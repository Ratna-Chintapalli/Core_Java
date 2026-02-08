package com.java8features;

import java.util.function.Function;

//Function Chaining (andThen)
public class TestJ8Demo6 {

	public static void main(String[] args) {
			Function<Integer,Integer> f1=(n)->n*2;
			Function<Integer,Integer> f2=(n)->n*n*n;
			System.out.println(f1.apply(2));//4
			System.out.println(f1.andThen(f2).apply(2));//64
			System.out.println(f1.compose(f2).apply(2));//16
			

	}

}
