package com.fileio;

import java.io.File;
//list()- returns list of files
public class TestFileIo3 {

	public static void main(String[] args) {
		File f=new File("D:\\Ratna\\Vcube\\workspace\\corejava\\");
		String[] listOfFiles=f.list();
		int count=0;
		for(String n:listOfFiles) {
			System.out.println(n);
			count++;
		}
		System.out.println(count + " No of files ");
	}

}
