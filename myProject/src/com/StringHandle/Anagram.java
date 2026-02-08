package com.StringHandle;

import java.util.Arrays;

public class Anagram {
	/*
	 * trim() removes only leading and trailing spaces
	 * It does not remove spaces inside the string
	 */

	public static void main(String[] args) {
		String s1="Funeral";
		String s2="Fun Real";
		//Covert it into Upper or lower case
		s1=s1.toLowerCase().replaceAll("\\s", "");
/*
 *        replaceAll("\\s", "")
 */
		s2=s2.toLowerCase().replaceAll("\\s", "");
		
		// check both string lengths 
		if(s1.length()==s2.length()) {
			//Convert it into Array og characters
			char[] a=s1.toCharArray();
			char[] b=s2.toCharArray();
			// Sort the array of characters
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a, b)) {
				System.out.println("Both Strings are Anagrams  ");
			}else {
				System.out.println("Not an Anagram");
			}
		}else {
			System.out.println("Two lenghts not matched");
		}

	}

}
