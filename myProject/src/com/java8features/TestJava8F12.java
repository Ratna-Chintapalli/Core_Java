package com.java8features;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestJava8F12 {

	public static void main(String[] args) {
		Supplier<Date> s2=()->new Date();
		System.out.println(s2.get());
		
		Supplier<String> s1=()->{
			return "Java 8 is more simple";
		};
		System.out.println(s1.get());
		
		
		System.out.println();
		Consumer<Integer> c1=(i) -> System.out.println(i*i*i);
		c1.accept(5);
		
		Consumer<String> c2=(i)->System.out.println(i.toUpperCase());
		c2.accept("Good Morning");
		
		
		System.out.println();
		Function<Integer , Integer> f1=i->i*i;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(9));
		
		Function<String,Integer> f2=s->s.length();
		System.out.println(f2.apply("JavaisSimple"));
		
		Function<String,String> f3=s->s.toLowerCase();
		System.out.println(f3.apply("JAva IS Simple"));
		
		
		Predicate<Integer> p1=(i)->i%2==0;
		System.out.println(p1.test(100));//true
		System.out.println(p1.test(7));//false
		System.out.println(p1.test(23));//false
		
		System.out.println();
		Predicate<String> p2=s ->s.contains("a");
		System.out.println(p2.test("Chintapalli")); //true
		System.out.println(p2.test("ratna"));//true
	}

}
