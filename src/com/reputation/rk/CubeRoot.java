package com.reputation.rk;

public class CubeRoot {
	public static void main(String[] args) {
		int a = 125;
		int boundary1;
		int boundary2;
		int answer = 0;
		while ((a * a * a) > 125)
			a = a / 2;
		boundary1 = a;
		boundary2 = a * 2;
		System.out.println(boundary1);
		System.out.println(boundary2);

		for (int w = boundary1; w < boundary2; w++) {
			if (w * w * w == 125)
				answer = w;
		}
		System.out.println(answer);
	}
}
