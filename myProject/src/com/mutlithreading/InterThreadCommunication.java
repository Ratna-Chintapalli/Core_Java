package com.mutlithreading;

class Resource {
	int i=0;
	boolean status=false;
	synchronized public void put(int i) throws InterruptedException {
		while(status) {
			wait();
		}
		this.i=i;
		System.out.println("Put : " +i);
		status=true;
		notify();
	}
	synchronized public void get() throws InterruptedException {
		while(!status) {
			wait();
		}
		System.out.println("Get : "+i);
		status=false;
		notify();
	}
}

class Producer implements Runnable{
	Resource r;
	Producer(Resource r){
		this.r=r;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	@Override
	public void run() {
		int i=0;
		while(true){
			
			try {
				r.put(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Consumer implements Runnable{
	
	Resource r;
	Consumer(Resource r) {
		this.r=r;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				r.get();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class InterThreadCommunication {
	public static void main(String[] args) {
		Resource r= new Resource ();
		Producer p1=new Producer(r);
		Consumer c1=new Consumer(r);
	}

}
