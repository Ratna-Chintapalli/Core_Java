package com.gut;

public class StringReverseWORSpecialChar {
	static String reverse(String s) {
		char[] ch = s.toCharArray();
		String c = "!@#$%^&*";
		int left = 0;
		int right = ch.length - 1;
		while (left < right) {
			if (c.contains(String.valueOf(ch[left]))) {
				left++;
			}
			// skip special char from right
			else if (c.contains(String.valueOf(ch[right]))) {
				right--;
			} else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		String s = "vc$123@jre56#";
		System.out.println("Reversed String : " + reverse(s));

	}

}
