package com.StringHandle;

public class C_Vowels_C_Consonants {

	public static void main(String[] args) {
		String s="JAva is simple ^@&99 3456789";
		int v=0;
		int c=0;
		int spaces=0;
		int specialChars=0;
		int d=0;
		for(char ch:s.toLowerCase().toCharArray()) {
			if("aeiou".indexOf(ch)!=-1) {
				v++;
			}else if(ch>='a' && ch<='z'){
				c++;
				
			}else if (ch == ' ') {
                spaces++;

            }else if(Character.isDigit(ch)) {
            	d++;
            }
			else {
                specialChars++;
            }
			
		}
		System.out.println("Vowels Count : "+v +" , consonant count : "+c );
		System.out.println("Digit : " +d);
		System.out.println("Spaces Count :"+spaces +" , special characters count : "+specialChars);

	}

}
