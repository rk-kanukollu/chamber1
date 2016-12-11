package com.reputation.rk;

public class Counter {
	public static void main(String args[]) {
		int lower = 10, upper = 20, counter = 16, result;
		if (counter >= lower && counter <= upper) {
			if (counter == upper) {
				result = lower;
				System.out.println(result);
			} else {
				result = counter + 1;
				System.out.println(result);
			}
		} else {
			System.out.println("not in range");
		}
	}
}
