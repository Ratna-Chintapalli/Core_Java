package com.mutlithreading;
class TestMT6 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			Thread.yield();
			System.out.println("RUN  : "+i);
		}

	}
}


public class TestMT6Yield {

	public static void main(String[] args) {
		TestMT6 t=new TestMT6();
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main  : "+i);
		}

	}
	
}
