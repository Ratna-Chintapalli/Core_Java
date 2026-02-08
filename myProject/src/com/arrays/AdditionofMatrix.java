package com.arrays;

public class AdditionofMatrix {

	public static void main(String[] args) {
		int[][] a= {{1,2},{3,4}};
		int[][] b= {{1,2},{3,4},{4,5}};
		int[][] c=new int[b.length][a.length];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i<a.length) {
					c[i][j]=a[i][j]+b[i][j];
				}else {
					c[i][j]=b[i][j];
				}
			}
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
