package com.reputation.rk;

import sun.applet.Main;

public class ReverseDigits {
	public static void main(String[] args) {
		int i = 3457;
		int m = 0;
		// int q = 0;
		int result = 0; // 7543
		int n = 0; // number of digits in i
		while (i > 0) {
			m = i % 10;
			i = i / 10;
			n++;
		}
		n--;
		i = 3457;
		while (i > 0) {
			m = i % 10;
			i = i / 10;
			result = result + m * (int) Math.pow(10, n);
			n--;
		}
		System.out.println(result);
	}
}
