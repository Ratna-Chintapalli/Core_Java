package com.gut;
public class PrimePalindrome extends Thread {
	static boolean prime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <=n/2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	static boolean palindrome(int n) {
		int temp = n;
		int rev = 0;
		while (temp > 0) {
			rev = rev * 10 + temp % 10;
			temp = temp / 10;
		}
		return rev == n;
	}
	public void run() {
		for (int n = 1; n <= 100; n++) {
			if (prime(n)) {
				System.out.println("Prime: " + n);
			}
		}
		for (int n = 1; n <= 100; n++) {
			if (palindrome(n)) {
				System.out.println("Palindrome: " + n);
			}
		}
	}
	public static void main(String[] args) {
		PrimePalindrome p = new PrimePalindrome();
		p.start();

	}

}
