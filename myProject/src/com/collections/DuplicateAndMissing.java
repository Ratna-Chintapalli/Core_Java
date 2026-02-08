package com.collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicateAndMissing {

	public static void main(String[] args) {
		int[] arr= {10,22,23,22,11,12,12,14,17,1,2};
		Set<Integer> s=new HashSet<>();
		for(int n:arr) {
			s.add(n);
			System.out.print(n +"  ");
		}

	}

}
