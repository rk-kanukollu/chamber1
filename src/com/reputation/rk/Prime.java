package com.reputation.rk;

public class Prime {
	public static void main(String args[]) {
		int n = 100;
		int[] a = new int[n];
		// System.out.println("2 3")
		int x = 2;
		a[0] = 2;
		a[1] = 3;
		for (int i = 4; x < n; i++) {
			if (isPrime(i)) {
				a[x++] = i;
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
