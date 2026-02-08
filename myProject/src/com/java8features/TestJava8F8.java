package com.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Lambda Expression vs Collections related Comparator


public class TestJava8F8 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,2,34,12,1,9,70);
		Comparator<Integer> c=(i1,i2)->(i1>i2)?1 :(i1<i2)?-1 :0;
		Collections.sort(l,c);
		System.out.println(l);

	}

}
