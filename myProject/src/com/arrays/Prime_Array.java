package com.arrays;
public class Prime_Array {
	static boolean isPrime(int r) {
		if (r < 2) {
			return false;
		}
		for (int i = 2; i < r; i++) {
			if (r % i == 0) {
				return false;
			}
		}
		return true;
	}
	static int nextPrime(int r) {
		r = r + 1;
		while (!isPrime(r)) {
			r++;
		}
		return r;
	}
	public static void main(String[] args) {
		int[][] arr= {{1,0,0},{0,1,0},{0,0,1}};
		int pr=2;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++) {
				int sum=i+j;
				if((isPrime(sum))) {
					arr[i][j]=pr;
					pr=nextPrime(pr);
				}
			}	
		}
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
	}

}
