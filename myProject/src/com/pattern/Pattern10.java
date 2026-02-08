package com.pattern;

public class Pattern10 {

	public static void main(String[] args) {
		int n=5;
		int n1=1;
		int n2=2;
		for(int i=0;i<=n;i++) {
			if(i%2!=0) {
				for(int j=1;j<=i;j++) {	
					System.out.print(" "+n1);
					n1=n1+2;	
				}
			}
			else {
				for(int j=1;j<=i;j++) {
					
					System.out.print(" "+n2);
					n2=n2+2;		
				}
			}
			System.out.println();
		}

	}

}
