package com.gut;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String s="swiss";
		String rev="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			//System.out.println(c);
			if(s.indexOf(c)==(s.lastIndexOf(c))) {
				rev=rev+c;
				break;
			}	
		}
		System.out.println(rev);
	}

}
