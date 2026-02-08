package com.stringhandling;
// Interview Question
public class TestStr8 {

	public static void main(String[] args) {
		//join()
		//String str="Hello Every One Happy new Year";
		String str1="Hello-Every-One-Happy-new-Year";
		int count=1;
		//String[] s1=str.split("\\s");
		String[] s1=str1.split("-",4);
		for(String w:s1) {
			System.out.print(w+ " ");
			count=count+1;
		}
		System.out.println();
		System.out.println(count);
		
		System.out.println();
		String s = "java programming";
		System.out.println(s.lastIndexOf('a'));//10
		System.out.println(s.lastIndexOf('a', 5));//3 -- Searches backward starting from the given index.
		System.out.println();
		String str = "java is java again";
		System.out.println(str.lastIndexOf("java"));

		
	}

}
