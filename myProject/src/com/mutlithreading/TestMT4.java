package com.mutlithreading;

public class TestMT4 extends Thread{

	public static void main(String[] args) {
		TestMT4 t=new TestMT4();
		t.start();
		System.out.println(TestMT4.currentThread());
		TestMT4.currentThread().setName("puppy");
		System.out.println("Name : "+TestMT4.currentThread().getName());
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("Ratna");
		System.out.println("name : "+ Thread.currentThread().getName());
	}
}
