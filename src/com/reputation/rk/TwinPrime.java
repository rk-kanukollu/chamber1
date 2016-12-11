package com.reputation.rk;

public class TwinPrime {
	public static void main(String args[]) {
		int n = 100;
		int n1=10;
		int[] a = new int[n];
		int[] b = new int[n1*2];

		int counter = 2;
		int x = 2;
		int y=0;
		a[0] = 2;
		a[1] = 3;

		for (int i = 4; i == i; i++) {
			int add = 0;
			for (int j = 2; j < i; j++) {
				if (i % j != 0)
					add++;
			}
			if (add + 2 == i) {
				a[x] = i;
				if(a[x]-a[x-1]==2)
				{b[y+1]=a[x];
			b[y]=a[x-1];
			y=y+2;}
				x++;
				counter++;
				
			}
if(y==20)
	break;
		}
		int sum = 0;
		for (int z = 0; z < n1*2; z++)
			{System.out.println(b[z]);
		    sum = sum + a[z];
			System.out.println(sum);}
	}
}
