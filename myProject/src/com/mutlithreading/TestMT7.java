package com.mutlithreading;

class JThread1 extends Thread{
	int sum=0;
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("J1 RUN  : "+i);
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
class JThread2 extends Thread{
	JThread3 j3;
	JThread2(JThread3 j3){
		this.j3=j3;
	}
	
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<=10;i++) {
			if(i==7) {
				try {
					j3.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("J2 RUN  : "+i);
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
class JThread3 extends Thread{
	int sum=0;
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("J3 RUN  : "+i);
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
public class TestMT7 {

	public static void main(String[] args) {
		JThread1 j1=new JThread1();
		JThread3 j3=new JThread3();
		JThread2 j2=new JThread2(j3);
		
		j1.start();
		//j1.interrupt();
		j2.start();
		j3.start();
		
		
	}

}
