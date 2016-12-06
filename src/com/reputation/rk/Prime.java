package com.reputation.rk;

public class Prime {
	public static void main(String[] args) {

		int n = 5;
		int array[] = new int[100];
		int array1[] = new int[100];
		array[0] = 2;
		int f = 1;
		for (int a = 3; a < 100; a++) {
			int q = 0;
			for (int b = 2; b < a; b++) {
				if (a % b != 0)
					q++;
			}
			if (q + 2 == a) {
				array[f] = a;
				f++;
			}
		}
		int sum = 0;

		for (int g = 0; g < n; g++)
			sum = sum + array[g];
		System.out.println(sum);
		
		int l = 0;
		int k = 0;
		
while(l<90)			
{
	
if (array[l] +2 == array[l+1]){
array1[k] = array[l];
array1[k+1] = array[l+1];
k++;
k++;
}
l++;
}

for (int z = 0; z < n; z++)
System.out.println(array1[z]);


}
	
	
	
	
	
}
