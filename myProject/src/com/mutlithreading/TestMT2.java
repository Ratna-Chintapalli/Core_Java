package com.mutlithreading;
//VLC media player :Audio video timer
class AudioThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Audio Info: "+i);
		}
	}
}
class VideoThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Video Info: "+i);
		}
	}
}
class TimerThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("TImer Info: "+i);
		}
	}
}

public class TestMT2 {
	public static void main(String[] args) {
		AudioThread a=new AudioThread();
		VideoThread v=new VideoThread();
		TimerThread t=new TimerThread();
		a.start();
		v.start();
		t.start();
	}

}
