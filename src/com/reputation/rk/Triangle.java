package com.reputation.rk;

public class Triangle {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 6;
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("triangle");
			if (a == b && a == c && b == c)
				System.out.println("equilateral");
			if (a == b || a == c | b == c)
				System.out.println("isoceles");
			if (a != b && a != c && b != c)
				System.out.println("scalene");
			if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
				System.out.println("90 degrees traingle");
			else if (a * a + b * b < c * c || a * a + c * c < b * b || b * b + c * c < a * a)
				System.out.println("obtuse traingle");
			else
				System.out.println("acute traingle");
		} else
			System.out.println("not a triangle");
	}
}
