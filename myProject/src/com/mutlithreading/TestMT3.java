package com.mutlithreading;

public class TestMT3 implements Runnable {

	public static void main(String[] args) {
		System.out.println("Main Method Started ");
		TestMT3 r=new TestMT3();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main : "+i);
		}
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("run : "+i);
		}
		
	}
	

}
