package com.reputation.rk;

public class Anagrams {
	public static void main(String[] args) {
		int a = 234;
		int array[] = new int[10];
		int x;
		int y;
		int z;
		array[0] = 234 % 10;
		array[1] = (234 % 100 - array[0]) / 10;
		array[2] = ((234 % 1000) - array[0] - (array[1] * 10)) / 100;
		if (array[0] > array[1] && array[0] > array[2])
			x = array[0];
		else if (array[1] > array[0] && array[1] > array[2])
			x = array[1];
		else
			x = array[2];
		if ((array[0] > array[1] && array[0] < array[2]) || (array[0] > array[2] && array[0] < array[1]))
			y = array[0];
		else if ((array[1] > array[0] && array[1] < array[2]) || (array[1] > array[2] && array[1] < array[0]))
			y = array[1];
		else
			y = array[2];
		if (array[0] < array[1] && array[0] < array[2])
			z = array[0];
		else if (array[1] < array[0] && array[1] < array[2])
			z = array[1];
		else
			z = array[2];
		System.out.println("largest");
		System.out.print(x);
		System.out.print(y);
		System.out.println(z);
		System.out.println("smallest");
		System.out.print(z);
		System.out.print(y);
		System.out.println(x);
		System.out.println("sexond largest");
		System.out.print(x);
		System.out.print(z);
		System.out.println(y);
	}
}
