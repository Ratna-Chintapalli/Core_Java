package com.oops;

public class LoanProcessThread extends Thread {

	private String processName;

	public LoanProcessThread(String processName) {
		this.processName = processName;
	}

	@Override
	public void run() {
		try {
			System.out.println(processName + " started...");
			Thread.sleep(2000); // simulate processing time
			System.out.println(processName + " completed.");
		} catch (InterruptedException e) {
			System.out.println("Process interrupted");
		}
	}
}
