package com.reputation.rk;

public class Prime {
	public static void main(String args[]) {
		int n = 100;
		int[] a = new int[n];

		// System.out.println("2 3")

		int counter = 2;
		int x = 2;
		a[0] = 2;
		a[1] = 3;

		while (counter < n)

		{
			for (int i = 4; i == i; i++) {
				int add = 0;
				for (int j = 2; j < i; j++) {
					if (i % j != 0) 
						add++;
				}
				if(add + 2 == i)
				{a[x] =i;
				x++;
				counter++;}
				if(counter == n)
					break;
				
			}

		}

		for (int z = 0; z < n; z++)
			System.out.println(a[z]);
		
		int sum =0;
		
	
		for (int z = 0; z < n; z++)
			sum = sum + a[z];
			System.out.println(sum);
		

	}
}
