package com.StringHandle;

public class StringCompressionCount {

	public static void main(String[] args) {
		String s="aaabbc";
		int count=1;
		for(int i=0;i<s.length();i++) {
			if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)) {//1<6 && a==a  
				count++;
			}else {
				System.out.println(s.charAt(i)+"  "+count);
				count=1;
			}
		}

	}

}
