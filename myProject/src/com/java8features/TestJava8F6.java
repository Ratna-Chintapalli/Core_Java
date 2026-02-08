package com.java8features;

// Lambda Expression vs Multithreading --> Runnable Interface - run()

public class TestJava8F6 {

	public static void main(String[] args) {
		//TestThread1 r=new TestThread1();
		Runnable r=() ->{
			for(int i=0;i<10;i++) {
				System.out.println("run : "+i);
			}

		};
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main  : "+i);
		}


	}

}
