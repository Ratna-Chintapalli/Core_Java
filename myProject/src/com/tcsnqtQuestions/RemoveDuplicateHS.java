package com.tcsnqtQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateHS {

	public static void main(String[] args) {
		int[] arr= {1, 2, 2, 3, 1, 4};
		Set<Integer> set=new HashSet<>();
		for(int a:arr) {
			set.add(a);
		}
		System.out.println(set);
	}

}
