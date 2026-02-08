package com.arrays;
public class Missing_Number_Arr {
	public static void main(String[] args) {
		int[] arr= {1,1,2,3,5,6};
		//System.out.println(arr.length);
		for(int i=0;i<arr.length-1;i++) {

			int first=arr[i];
			int second=arr[i+1];
			for(int j=first+1;j<second;j++) {
				if(first==second) {
					continue;
				}
					System.out.println(j);
			}
		}
		

	}

}
