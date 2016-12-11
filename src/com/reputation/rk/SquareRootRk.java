package com.reputation.rk;

public class SquareRootRk {
	int a;
	int boundary1;
	int boundary2;
	int answer = 0;

	int sqrt(int qa) {
		a = qa;
		while ((a * a) > qa)
			a = a / 2;
		boundary1 = a;
		boundary2 = a * 2;
		System.out.println(boundary1);
		System.out.println(boundary2);
		for (int w = boundary1; w < boundary2; w++) {
			if (w * w == qa)
				answer = w;
		}
		return answer;
	}
}
