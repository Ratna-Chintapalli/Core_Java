package com.tcsnqtQuestions;

import java.util.HashSet;

public class ArrayTraverse {


	public static void main(String[] args) {
		int[] arr= {3 , 4,22,1,56,45,90,4,3,1};
		HashSet<Integer> set=new HashSet<>();
		for(int a:arr) {
			set.add(a);
		}

		for(int n:set) {
			System.out.println(n);
		}
	}

	

}
