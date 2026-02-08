package com.stringhandling;

import java.util.Scanner;

public class Permutations {
	static void permutation(char[] c, int start, int end) {
		if (start == end) {
			System.out.println(new String(c));
		}
		for (int i = start; i <= end; i++) {
			swap(c, start,i);
			permutation(c,start+1,end);
			swap(c,start,i);
			
		}
	}

	static void swap(char ch[], int start, int end) {
		char temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		permutation(c, 0, c.length-1);

	}

}
