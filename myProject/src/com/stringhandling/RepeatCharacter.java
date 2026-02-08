package com.stringhandling;

import java.util.Scanner;

public class RepeatCharacter {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.next();
		String result="";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);

            if (Character.isDigit(c)) {
                int count = c - '0';//'2'-'0'
                char prev = str.charAt(i - 1);// previous character
                for (int j = 0; j < count; j++) {
                    result = result + prev;
                }
            }
        }
        System.out.print(result); 
       
       */
        
        
        String str = "aabbbcccc";
        String result = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            // if next character is same, increase count
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } 
            // if character changes or end of string
            else {
                result = result + str.charAt(i) + count;
                count = 1; // reset count
            }
        }

        System.out.println(result);
          
        
	

//		String str = "a2b3c4";
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < str.length(); i++) {
//			char c = str.charAt(i);
//			if (Character.isDigit(c)) { //Character.isDigit(c)-->Check if the current character is a number.
//				int count = c - '0'; // Convert character '2' → integer 2.
//				char prev = str.charAt(i - 1);//Get the previous character (the letter)
//				for (int j = 0; j < count; j++) {
//					sb.append(prev);
//				}
//			}
//		}
//		System.out.print(sb);

	}

}
