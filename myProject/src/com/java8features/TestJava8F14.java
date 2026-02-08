package com.java8features;

import java.util.function.Supplier;

public class TestJava8F14 {

	public static void main(String[] args) {
		Supplier<String> s1=()->{
			String otp = "";
		    for (int i = 0; i < 6; i++) {
		        otp = otp + (int)(Math.random() * 10);
		    }
		    return otp;
		};
		System.out.println("OTP : " +s1.get());

	}

}
