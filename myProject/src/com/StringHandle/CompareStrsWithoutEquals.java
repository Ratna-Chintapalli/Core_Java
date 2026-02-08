package com.StringHandle;

public class CompareStrsWithoutEquals {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		boolean same=true;
		if(s1.length()!=s2.length()) {
			same=false;
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					same=false;
				}else {
					same=true;
				}
			}
			
		}
		System.out.println(same);

	}

}
