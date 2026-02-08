package com.java8features;

public class TestJava8F10 {

	public static void main(String[] args) {
		Thread t=new Thread() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("run : "+i);
				}
			}
		};
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main : "+i);
		}
	}

}
