package com.reputation.rk;

import java.math.BigDecimal;

public class FactorialWithBigDecimal {
	public static void main(String[] args) {
		int n = 100;
		int a = 0, b = 0, c = 0, d = 0;
		BigDecimal f = new BigDecimal("1");
		for (int i = 1; i <= n; ++i) {
			f = f.multiply(new BigDecimal(i));
			System.out.println("factorial of i = " + i + " f=" + f);
			if (f.compareTo(new BigDecimal(Byte.MAX_VALUE)) <= 0) {
				a = i;
				a++;
			}
			if (f.compareTo(new BigDecimal(Short.MAX_VALUE)) <= 0) {
				b = i;
				b++;
			}
			if (f.compareTo(new BigDecimal(Integer.MAX_VALUE)) <= 0) {
				c = i;
				c++;
			}
			if (f.compareTo(new BigDecimal(Long.MAX_VALUE)) <= 0) {
				d = i;
				d++;
			}
		}
		System.out.println("byte, short, int, long " + a + " " + b + " " + c + " " + d);
	}
}
