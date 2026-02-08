package com.case_study;
import java.util.Scanner;
public class NameNormalization {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Name : ");
		String name=sc.nextLine();
		name=name.trim().replaceAll("\\s+", " ");
		String[] words=name.split(" ");
		String result="";
		for(String w:words) {
			result=result+" "+Character.toUpperCase(w.charAt(0))+w.substring(1).toLowerCase()+"";
		}
		System.out.println(" Name  : "+result.trim());
	}
}
