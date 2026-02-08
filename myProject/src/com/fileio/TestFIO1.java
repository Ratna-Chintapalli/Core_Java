package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFIO1 {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\Ratna\\Vcube\\workspace\\corejava\\myProject\\text\\ratna1.txt");
		if(!f.exists()) {
			boolean status=f.createNewFile();
			if(status) {
				System.out.println("File created");
			}else {
				System.out.println("Not created");
			}
		}
		
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		//System.out.println(f.delete());
	}

}
