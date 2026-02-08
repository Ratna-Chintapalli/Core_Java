package com.StringHandle;

public class CharCount {

	public static void main(String[] args) {
		String str="aaabbbbcc";
		StringBuilder b=new StringBuilder();
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(i + 1 < str.length() && str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				b.append(str.charAt(i)).append(count);
				count=1;
				//System.out.println(b);
			}
		}
		System.out.println(b);
		//System.out.println(b.toString());

	}

}
