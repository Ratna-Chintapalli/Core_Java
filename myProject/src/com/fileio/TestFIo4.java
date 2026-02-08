package com.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFIo4 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method ");
		File f = new File("D:\\Ratna\\Vcube\\workspace\\corejava\\myProject\\text\\rat");

		File f1 = new File(f, "test1.txt");
		// FileWriter fw1=new
		// FileWriter("D:\\Ratna\\Vcube\\workspace\\corejava\\myProject\\text\\rat.txt");
		FileWriter fw = new FileWriter(f1,true);
		//try - with resources 
		try (BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Hello");
			bw.newLine();
			bw.write(100);//d
			bw.newLine();
			bw.write('A');//A
			bw.flush();
		}

	}

}
