package com.arrays;

public class TDemo9 {

	public static void main(String[] args) {
		int[] array = { 12, 3050, 44, 9 };
		int key=44;
		for (int i=0;i<array.length;i++) {
			int number=array[i];
			if(number==key) {
				System.out.println("Match "+array[i]);
			}else {
				System.out.println("Not match :"+array[i]);
			}
			
		}


	}

}
