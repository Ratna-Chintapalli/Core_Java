package com.collections;

import java.util.ArrayList;

public class TestArrayDemo {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("Java");
		a.add("is");
		a.add("simple");
		for(String ele:a) {
			System.out.println(ele);
		}
		if(a.contains("is")) {
			System.out.println("Element exists ");
		}else {
			System.out.println("Not exists");
		}

	}

}
