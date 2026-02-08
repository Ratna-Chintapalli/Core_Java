package com.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFIo2 {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Ratna\\Vcube\\workspace\\corejava\\myProject\\text\\rat");
		// mkdir() - to create directory 
		f.mkdir();
		
		// to create file 
		File f1=new File(f,"test.txt");
		
		
		//FileWriter fw1=new FileWriter("D:\\Ratna\\Vcube\\workspace\\corejava\\myProject\\text\\rat.txt");
		FileWriter fw=new FileWriter(f1);
		
		//f1.createNewFile();
		fw.write("Good morning");
		fw.write('\n');
		fw.write(65);//A
		fw.write('\n');
		fw.write('A');//A

		fw.flush();
	}

}
