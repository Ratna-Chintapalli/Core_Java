package com.StringHandle;

public class StrCompression {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s="aaabbc";
		int count=1;
		for (int i = 0; i < s.length(); i++) {
		    if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
		        count++;
		    } else {
		        sb.append(s.charAt(i)).append(count);
		        count = 1;
		    }
		}
		System.out.println(sb);


	}

}
