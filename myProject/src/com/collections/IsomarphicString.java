package com.collections;

import java.util.Arrays;

public class IsomarphicString {
	 static int[] isIsomarphic(char[] c) {
		 int[] frequ=new int[c.length];
		 boolean[] visited=new boolean[c.length];
		 for(int i=0;i<c.length;i++) {
			 if(visited[i]) {
				 continue;
			 }
			 int count=0;
			 for(int j=0;j<c.length;j++) {
				 if(c[i]==c[j]) {
					 count++;
					 visited[j]=true;
				 }
			 }
			 frequ[i]=count;
		 }
			
			return frequ;
		}

	public static void main(String[] args) {
		String s1="cake";
		String s2="book";
		char[] c=s1.toCharArray();
		char[] c2=s2.toCharArray();
		int[] freq=isIsomarphic(c);
		int[] refreq=isIsomarphic(c2);
		if(Arrays.equals(freq, refreq)) {
			System.out.println("Isomarphic String");
		}else {
			System.out.println("Not Isomarphic ");
		}
	}

	

}
