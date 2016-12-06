package com.reputation.rk;

public class Decimal {
	public static void main(String[] args) {
		int array[] = new int[5];
		array[0] = 1;
		array[1] = 1;
		array[2] = 1;
		array[3] = 1;
		array[4] = 1;
		int c = 1;
		int a = 0;
		for (int b = 0; b < 5; b++) {
			a = a + c * array[b];
			c = c * 2;
		}
		System.out.println(a);
	}
}
