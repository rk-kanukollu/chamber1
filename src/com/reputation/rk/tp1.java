package com.reputation.rk;

public class tp1 {
	public static void main(String[] args) {
		double input = 5;
		double guess = 1;
		double approx = 0.0000000000000005;
		int c=0;
		while (Math.abs(guess * guess - input) > approx) {
			guess = (guess + input / guess) / 2;
			++c;
			System.out.println(c);
			System.out.println(guess);
			System.out.println(guess * guess);
		}
	}
}
