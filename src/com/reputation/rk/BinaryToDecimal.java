package com.reputation.rk;

public class BinaryToDecimal {
	public static void main(String[] args) {
		String input = new String("1101");
		int length = input.length();
		int c = 1;
		int a = 0;
		for (int b = (length - 1); b >= 0; b--) {
			char z = input.charAt(b);
			a = a + (c * (z-'0'));
			c = c * 2;
		}
		System.out.println(a);
	}
}
