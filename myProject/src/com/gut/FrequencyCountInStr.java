package com.gut;
public class FrequencyCountInStr {
	public static void main(String[] args) {
		String n="banana";
		int count=0;
		for(int i=0;i<n.length();i++) {
			char ch=n.charAt(i);
			for(int j=i+1;j<n.length();j++) {
				if(n.charAt(j)==ch) {
					count++;	
				}
				else {
					count=1;
				}
			}
			if(n.indexOf(ch)==i) {
				System.out.println(ch+"-"+count);
			}
			
		}
		

	}

}
