package com.gut;

public class Pattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.println("");
				if(i==j ) {
					System.out.println("*");
				}
//				}else {
//					System.out.println(" ");
//				}
			}
		}
	}

}
