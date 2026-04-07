package com.tcsnqtQuestions;

import java.util.*;
public class CountVoewlsCons {

	public static void main(String[] args) {
		String s="ratna ";
		System.out.println(s.toUpperCase());
		int vcount=0;
		int cCount=0;
		for(int i=0;i<s.length()-1;i++) {
			char ch=s.charAt(i);
			if("aeiou".indexOf(ch)==-1) {
				vcount++;
			}else {
				cCount++;
			}
		}
		System.out.println("Vowel Count "+ vcount);

		System.out.println("Consonant Count : "+cCount);
	}
	
	

}
