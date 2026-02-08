package com.stringhandling;

import java.util.Scanner;

public class VowelC_ConsonantC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		String res=s.replace(" ", " ");
		String vowel=" ";
		int v_c=0;
		String consonants=" ";
		int c_c=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'|| c=='A' || c=='e'|| c=='E'|| c=='i'|| c=='I'||c=='o'|| c=='O' || c=='u'|| c=='U') {
				res=res+vowel;
				v_c++;
				
			}else {
				res=res+consonants;
				c_c++;
			}
			
		}
		System.out.println(res);
		System.out.println(c_c);
		System.out.println(v_c);
		
	}

}
