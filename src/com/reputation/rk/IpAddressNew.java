package com.reputation.rk;

public class IpAddressNew {
	public static void main(String[] args) {
		String input = new String("11.4.4.67");
		long t = 0;
		int[] x = new int[20];
		for (int i = input.length() - 1; i >= 0; i--) {
			String firstLetter = String.valueOf(input.charAt(i));
			if (firstLetter.equals("."))
				x[i] = -1;
			if (firstLetter.equals("0"))
				x[i] = 0;

			if (firstLetter.equals("1"))
				x[i] = 1;

			if (firstLetter.equals("2"))
				x[i] = 2;

			if (firstLetter.equals("3"))
				x[i] = 3;

			if (firstLetter.equals("4"))
				x[i] = 4;

			if (firstLetter.equals("5"))
				x[i] = 5;

			if (firstLetter.equals("6"))
				x[i] = 6;

			if (firstLetter.equals("7"))
				x[i] = 7;

			if (firstLetter.equals("8"))
				x[i] = 8;

			if (firstLetter.equals("9"))
				x[i] = 9;
		}
		long q = 0;
		int n = input.length() - 1;
		long g = 1;
		while (x[n] != -1) {
			q = q + g * x[n];
			n--;
			g = g * 10;
		}
		System.out.println(q);
		t = t + q;
		n--;
		q = 0;
		g = 256;

		while (x[n] != -1) {
			q = q + g * x[n];
			n--;
			g = g * 10;
		}
		System.out.println(q);
		t = t + q;
		n--;
		q = 0;
		g = 256 * 256;
		while (x[n] != -1) {
			q = q + g * x[n];
			n--;
			g = g * 10;
		}
		System.out.println(q);
		t = t + q;
		n--;
		q = 0;
		g = 256 * 256 * 256;
		while (x[n] != -1 && n >= 0) {
			q = q + g * x[n];
			n--;
			g = g * 10;
		}
		System.out.println(q);
		t = t + q;
		System.out.println(t);
	}
}
