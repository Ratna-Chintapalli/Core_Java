package com.tcsnqtQuestions;
import java.util.*;
public class CountFrequencyHS {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 1, 4, 2};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int n:arr) {
			if(map.containsKey(n)) {
				map.put(n, map.put(n, 0)+1);
			}else {
				map.put(n, 1);
			}
			
		}
		System.out.println(map);

	}

}
