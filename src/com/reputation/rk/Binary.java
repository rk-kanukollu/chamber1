package com.reputation.rk;

public class Binary {
	//something
	public static void main(String[] args) {
		int array[] = new int[10];
		int a = 0;
		int b = 107;
		while (b > 0) {
			if (b % 2 == 0) {
				array[a] = 0;
				b = b / 2;
			} else {
				array[a] = 1;
				b = (b - 1) / 2;
			}
			a++;
		}
		for (int i = a - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
	}
}