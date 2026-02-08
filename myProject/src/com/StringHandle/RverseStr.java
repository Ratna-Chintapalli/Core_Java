package com.StringHandle;

public class RverseStr {

	public static void main(String[] args) {
		String s="mom";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
//		if(rev.equals(s)) {
//			System.out.println("Palindrome ");
//		}else {
//			System.out.println("Not Palindrome ");
//		}
	}

}
