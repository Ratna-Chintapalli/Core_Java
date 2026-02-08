package com.oops;

public class MOLVarArgs {
	
	static void addition(int... i) {
        int sum = 0;
        for (int e : i) {
            sum += e;
        }
        System.out.println("Sum: " + sum);
    }

	public static void main(String[] args) {
		addition();
		addition(10,20);
		addition(10,30,40);
	

	}

}
