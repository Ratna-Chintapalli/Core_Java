package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateBruteforce {

	public static void main(String[] args) {
		int arr[]= {1,2,4,3,2,1,5,2};
		Set<Integer> s=new HashSet<>();
		for(int a:arr) {
			if(!s.add(a)) {
				System.out.println(a);
			}
		}
		System.out.println(s);

	}

}
