package com.reputation.rk;

public class SumOfCubeOfN {
	public static void main(String[] args) {
		int x = 0;
		for (int i = 3; i > 0; i--)
			x = x + i * i*i;
		System.out.println(x);
	}

}
