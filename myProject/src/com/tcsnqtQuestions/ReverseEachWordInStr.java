package com.tcsnqtQuestions;

public class ReverseEachWordInStr {

	public static void main(String[] args) {
		String s="hi  hello how are you";
		String[] word=s.split("\\s+");
		String rev="";
		for(String a:word) {
			for(int i=a.length()-1;i>=0;i--) {
				rev=rev+a.charAt(i);
			}
			System.out.print(rev+ " ");
		}

	}

}
