package com.reputation.rk;

import java.math.BigDecimal;

public class FactorialWithBigDecimal2 {
	public static void main(String[] args) {
		int n = 100;
		BigDecimal f = new BigDecimal("1");
		for (int i = 1; i <= n; ++i) {
			f = f.multiply(new BigDecimal(i));
			System.out.println("factorial of i = " + i + " f=" + f);

			BigDecimal x = new BigDecimal(Long.MAX_VALUE);
			if (f.compareTo(x) == 1)
				System.out.println("crossed the limit of long for i = " + i);
			BigDecimal y = new BigDecimal(Integer.MAX_VALUE);
			if (f.compareTo(y) == 1)
				System.out.println("crossed the limit of int for i = " + i);
			BigDecimal z = new BigDecimal(Short.MAX_VALUE);
			if (f.compareTo(z) == 1)
				System.out.println("crossed the limit of short for i = " + i);
			BigDecimal a = new BigDecimal(Byte.MAX_VALUE);
			if (f.compareTo(a) == 1)
				System.out.println("crossed the limit of byte for i = " + i);
		}
	}
}
