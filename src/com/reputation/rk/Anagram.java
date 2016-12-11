package com.reputation.rk;

public class Anagram {
	public static void main(String[] args) {
		String input = new String("468719");
		int length = input.length();

		int[] arr1 = method11(input);
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);

		
		int[] arr2 = method22(arr1);

		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		System.out.println(arr2[5]);

		int z = 0;
		// doubt2

		for (int a = 0; a < length; a++) {
			for (int b = 0; b < length; b++) {
				if (b != a) {
					for (int c = 0; c < length; c++) {
						if (c != b && c != a) {
							for (int d = 0; d < length; d++) {
								if (d != c && d != b && d != a) {
									for (int e = 0; e < length; e++) {
										if (e != d && e != c && e != b && e != a) {
											for (int f = 0; f < length; f++) {
												if (f != e && f != d && f != c && f != b && f != a) {

													arr1[z] = arr2[a] * 100000 + arr2[b] * 10000 + arr2[c] * 1000
															+ arr2[d] * 100 + arr2[e] * 10 + arr2[f];
													z++;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(z);
		for (int s = 0; s < z; s++)
			System.out.println(arr1[s]);

	}

	static int[] method11(String xyz) {
		int length = xyz.length();
		String firstLetter1 = "";
		int[] arr = new int[length];
		for (int j = 0; j < length; j++) {
			firstLetter1 = String.valueOf(xyz.charAt(j));
			if (firstLetter1.equals("0"))
				arr[j] = 0;
			if (firstLetter1.equals("1"))
				arr[j] = 1;
			if (firstLetter1.equals("2"))
				arr[j] = 2;
			if (firstLetter1.equals("3"))
				arr[j] = 3;
			if (firstLetter1.equals("4"))
				arr[j] = 4;
			if (firstLetter1.equals("5"))
				arr[j] = 5;
			if (firstLetter1.equals("6"))
				arr[j] = 6;
			if (firstLetter1.equals("7"))
				arr[j] = 7;
			if (firstLetter1.equals("8"))
				arr[j] = 8;
			if (firstLetter1.equals("9"))
				arr[j] = 9;
		}
		return arr;
	}

	static int[] method22(int[] arr) {
		int p = 0;
		int length = arr.length;
		int[] arr1 = new int[length];
		for (int w = 0; w < length; w++) {
			for (int q = w + 1; q < length; q++) {
				if (arr1[w] < arr1[q])
					;
				else {
					p = arr1[q];

					arr1[q] = arr1[w];
					arr[w] = p;
				}
			}
		}
		return arr;
	}
}
