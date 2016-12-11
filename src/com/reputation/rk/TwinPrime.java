package com.reputation.rk;

public class TwinPrime {
	public static void main(String args[]) {
		int n = 100;
		int[] a = new int[n];
		int x = 2;
		a[0] = 3;
		a[1] = 5;
		for (int i = 7; x < n; i = i + 2) {
			if (isPrime(i) && isPrime(i - 2)) {
				a[x] = i - 2;
				a[x + 1] = i;
				x = x + 2;
			}
		}
		for (int z = 0; z < n; z++)
			System.out.println(a[z]);
		int sum = 0;
		for (int z = 0; z < n; z++)
			sum = sum + a[z];
		System.out.println(sum);
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j < i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
