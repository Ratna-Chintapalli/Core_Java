package com.arrays;

public class TDemo13_ReplaceOnlyEvenPosition {
    // Check even number
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 4, 11, 2 };
        // Step 1: Count even numbers
        int count = 0;
        for (int n : arr) {
            if (isEven(n)) {
            	count++;
            }
        }
        // Step 2: Store even numbers in new array
        int[] evens = new int[count];
        int index = 0;
        for (int n : arr) {
            if (isEven(n)) {
            	evens[index++] = n;
            }
        }
        // Step 3: Sort even numbers (simple bubble sort)
        for (int i = 0; i < evens.length - 1; i++) {
            for (int j = 0; j < evens.length - 1; j++) {
                if (evens[j] > evens[j + 1]) {
                    int temp = evens[j];
                    evens[j] = evens[j + 1];
                    evens[j + 1] = temp;
                }
            }
        }
        // Step 4: Replace only even numbers in original array
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                arr[i] = evens[index++];
            }
        }
        // Print array
        for (int n : arr) {
            System.out.print(n + "  ");
        }
    }
}




