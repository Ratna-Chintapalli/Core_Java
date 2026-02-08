package com.StringHandle;

import java.util.HashSet;

public class SumOfDigits {
	public static void main(String[] args) {
		/*
		 * Why (c - '0')?
		 * '0' ASCII value = 48
		 * '5' - '0' → 53 - 48 = 5
		 * ✔ Converts character digit into integer
		 */
		 HashSet<Integer> set = new HashSet<>();

        String str = "a1b233n11093#1d";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
            	int num = c - '0';

                if (num != 0 && !set.contains(num)) {
                    sum += num;
                    set.add(num);
                }
            }
        }
        System.out.println("Sum of digits = " + sum);
    }
}
