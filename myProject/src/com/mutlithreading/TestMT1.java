package com.mutlithreading;

public class TestMT1 extends Thread {
	public static void main(String[] args) {
		System.out.println("Main Method Started ");
		TestMT1 t = new TestMT1();
		t.start();
		t.start();
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("Main :" + i);
		}
		
	}

	@Override
	public void run() {
		System.out.println(currentThread());
		for (int i = 0; i < 10; i++) {
			System.out.println("run :" + i);
		}
	}

}
