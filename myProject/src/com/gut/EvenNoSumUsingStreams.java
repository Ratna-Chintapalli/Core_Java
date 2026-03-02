package com.gut;

import java.util.Arrays;
import java.util.List;

public class EvenNoSumUsingStreams {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,223,34,245,65,76,78,976);
		//l.stream().filter(i->i%2==0).reduce(0,Integer::sum).forEach(System.out::println);
		int sum=l.stream().filter(i->i%2==0).reduce(0,Integer::sum);
		System.out.println(sum);
		System.out.println();
		int s=l.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(s);
	}

}
