package com.collections;

import java.util.ArrayList;

public class DuplicateEleAL {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(4);
		a.add(3);
		a.add(2);
		a.add(7);
		a.add(8);
		a.add(2);
		a.add(3);
		a.add(1);
		System.out.println(a);
		int count = 0;
		ArrayList<Integer> b = new ArrayList<>();
		for (int i = 0; i < a.size() ; i++) {

			for (int j = i+1; j < a.size() ; j++) {
				if ((a.get(i)).equals(a.get(j))) {
					if (!b.contains(a.get(i))) {
						b.add(a.get(i));
					}
				}
			}
		}
		System.out.println(b);

	}

}
