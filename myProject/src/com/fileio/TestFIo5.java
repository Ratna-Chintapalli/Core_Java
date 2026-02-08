package com.fileio;

import java.io.FileReader;
import java.io.IOException;

public class TestFIo5 {
// Exception Propagation
	// IOEXception is parent of FileNotFoundException
	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr=new FileReader("D:\\Ratna\\Vcube\\workspace\\corejava\\myProject\\rat\\test2.txt");
		int i=fr.read();// Reads Single character each time, -1 retunrs if not chars there
		while(i!=-1) {
			Thread.sleep(100);
			System.out.println((char)i);
			i=fr.read();
		}
	}

}
