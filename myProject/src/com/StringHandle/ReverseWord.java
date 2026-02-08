package com.StringHandle;

public class ReverseWord {

	public static void main(String[] args) {
		//program  to reverse each word
		String s="hello vcube students";
		for(String str:s.split(" ")) {
			System.out.println(new StringBuffer(str).reverse()+"  ");
		}

	}

}
