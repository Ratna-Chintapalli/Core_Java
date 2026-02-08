package com.arrays;

public class TDemo10DupllicateEle {

	public static void main(String[] args) {
		int[] array = { 12, 305,12, 44, 2,9,12,9 };
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println("Duplicate :"+array[i]);
				}
			}
		}

	}

}
