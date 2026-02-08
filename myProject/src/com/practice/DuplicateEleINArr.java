package com.practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateEleINArr {

	public static void main(String[] args) {
		int[] arr= {10,22,23,22,11,12,12,14,17,1,2};
		Set<Integer> s=new HashSet<>();
		//boolean flag=True;
		for(int i:arr) {
			if(!s.add(i)) {
				System.out.print(i+ "  ");
			}
		}
		
	}

}
