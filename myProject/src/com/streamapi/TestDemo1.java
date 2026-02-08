package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class TestDemo1 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,3,5,2,8,4);
		l.sort((a,b)->a-b);
		System.out.println(l);

	}

}
