package com.reputation.rk;

import java.util.Date;

public class Arr {
	/**
	 * Returns an array with elements in reverse order of the given array
	 * <code>a</code>.
	 * 
	 * @param a
	 * @return an array with elements in reverse order
	 */
	public static int[] reverse(int[] a) {
		int[] b = a;
		int l = b.length;
		int[] c = new int[l];
		for (int i = 0; i < l; i++)
			c[l - 1 - i] = b[i];
		return c;
	}

	public static int[] sort(int[] a) {
		int[] b = a;
		int l = b.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				int p = 0;
				if (b[i] >= b[j]) {
					p = b[j];
					b[j] = b[i];
					b[i] = p;
				}
			}
		}
		return b;
	}

	public static String[] sort(String[] a) {
		String[] b = a;
		int l = b.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				String p = "";
				if (b[i].compareTo(b[j]) >= 0) {
					p = b[j];
					b[j] = b[i];
					b[i] = p;
				}
			}
		}
		return b;
	}

	public static Date[] sort(Date[] a) {
		Date[] b = a;
		int l = b.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				Date p = null;
				if (b[i].compareTo(b[j]) >= 0) {
					p = b[j];
					b[j] = b[i];
					b[i] = p;
				}
			}
		}
		return b;
	}

	public static int indexOf(int[] a, int b) {
		int d = b;
		int ll = 0;
		int[] c = a;
		int l = c.length;
		for (int i = 0; i < l; i++) {
			if (d == c[i])
				ll = i;
		}
		return ll;
	}
}
