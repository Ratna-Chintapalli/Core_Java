package com.tcsnqtQuestions;

public class StringCompression {

	public static void main(String[] args) {
		String s = "aaabbssd";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				System.out.print(s.charAt(i) + "" + count);
				count = 1;
			}

		}
	}

}
