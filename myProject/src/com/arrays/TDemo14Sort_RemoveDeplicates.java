package com.arrays;

public class TDemo14Sort_RemoveDeplicates {

	public static void main(String[] args) {
		int[]  a= {50,30,40,70,30,66,22,5};
		int temp=0;
		for(int r:a) {
			System.out.print(r+"  ");
		}
		 
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				//asce-->a[j+1]<a[j]    ,    desc--> a[j+1]>a[j]
				if(a[j+1]<a[j]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		int count = 1; 
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        result[index++] = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                result[index++] = a[i];
            }
        }
		System.out.println("After Sorting ");
		for(int r:a) {
			System.out.print(r+"  ");
		}



	}

}
