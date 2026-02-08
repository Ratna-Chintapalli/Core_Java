package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestCollectionSS1 {

	public static void main(String[] args) {
		SortedSet<String> s=new TreeSet<>();
		s.add("Kohli");
		s.add("Virat");
		s.add("Rohit");
		s.add("Jadeja");
		s.add("Thala");
		System.out.println(s);//[Jadeja, Kohli, Rohit, Thala, Virat]
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.getFirst());
		System.out.println(s.getLast());
		System.out.println(s.reversed());//[Virat, Thala, Rohit, Kohli, Jadeja]
		System.out.println(s.headSet("Kohli"));
		System.out.println(s.tailSet("Rohit"));
		System.out.println(s.subSet("Kohli", "Virat"));
		System.out.println(s.removeFirst());
		System.out.println(s.removeLast());


	}

}
