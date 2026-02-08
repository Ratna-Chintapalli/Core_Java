package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestCollectionNS {

	public static void main(String[] args) {
		NavigableSet<String> ns=new TreeSet<>();
		ns.add("banana");
		ns.add("potato");
		ns.add("tomato");
		ns.add("beans");
		ns.add("brinjal");
		System.out.println(ns);
//Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
		System.out.println(ns.ceiling("potata"));//potato
		
//Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
		System.out.println(ns.floor("brijal"));//beans
		
//Returns the least element in this set strictly greater than the given element, or null if there is no such element.		
		System.out.println(ns.higher("tomata"));//tomato
		
//Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
		System.out.println(ns.lower("bean"));//banana
	}

}
