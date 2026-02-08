package com.mutlithreading;
class SThread extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) { 
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("RUN  : "+i);
		}

	}
}

public class TestMT8 {

	public static void main(String[] args) {
		System.out.println("Main Method Started ");
		SThread s1=new SThread();
		s1.start();
		s1.interrupt();

	}

}
