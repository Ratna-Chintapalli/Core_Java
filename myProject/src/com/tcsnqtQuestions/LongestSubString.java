package com.tcsnqtQuestions;
import java.util.*;
public class LongestSubString {

	public static void main(String[] args) {
		String s="abcadbc";
		int left=0;
		int max=0;
		Set<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(left++));
			}
			set.add(s.charAt(i));
			max=Math.max(max,set.size());
		}
		System.out.println(set + " "+max);
		

	}

}
