package com.mutlithreading;

public class TestMT5 extends Thread{

	public static void main(String[] args) {
		//TestMT5.currentThread().setPriority(MAX_PRIORITY);
		TestMT5.currentThread().setPriority(10);
		//TestMT5.currentThread().setPriority(100); --> Runtime Exception -- IllegalArgumentException
		System.out.println(TestMT5.currentThread().getName());
		TestMT5 t=new TestMT5();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main : "+i);
		}

	}
	@Override
	public void run() {
		System.out.println(TestMT5.currentThread());
		TestMT5.currentThread().setPriority(1);
		//TestMT5.currentThread().setPriority(MIN_PRIORITY);
		for(int i=0;i<10;i++) {
			System.out.println("Run : "+i);
		}
	}
}
