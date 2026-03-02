package com.streamapi;

import java.util.Optional;

//Optional<T> is a container object that may or may not contain a value.
//It helps avoid NullPointerException.
public class OptionalDemo1 {

	public static void main(String[] args) {
		Optional<String> n = Optional.of("Java");
		String result = n.orElse("Default");
		System.out.println(result);
		//String result1 = n.orElse(getDefaultValue());

		System.out.println("****************");
		
		
		Optional<String> opt = Optional.of("Spring");
		System.out.println(opt.get());
		System.out.println("****************");
		
		String name = null;
		Optional<String> o = Optional.ofNullable(name);
		System.out.println(o.orElse("Default Name"));
		System.out.println("****************");
		Optional<String> op = Optional.empty();
		System.out.println(op.isPresent()); // false
		System.out.println("****************");
		Optional<String> opt1 = Optional.of("Java");
		if (opt.isPresent()) {
		    System.out.println(opt1.get());
		}



	}

}
