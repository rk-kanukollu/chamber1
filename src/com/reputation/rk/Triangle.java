package com.reputation.rk;

public class Triangle {
	public static void main(String[] args) {
		float a = (float) 4.1;
		float b = (float) 4.3;
		float c = (float) 5.0;
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

		SquareRootRk as = new SquareRootRk();
		int we = as.sqrt(121);
		System.out.println(we);
		Exp11 ur = new Exp11();
		String ty = ur.emp11("23", "11");
		System.out.println(ty);
	}
}
