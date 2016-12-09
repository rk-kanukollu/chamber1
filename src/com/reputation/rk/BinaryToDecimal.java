package com.reputation.rk;


public class BinaryToDecimal {
	public static void main(String[] args) {
		
		
		String input = new String("1101");
		int length = input.length();
		
		//System.out.println(length);
		
		int[] x = new int[length];
		
		
		

		int c = 1;
		int a = 0;
		for (int b = (length - 1); b >=0; b--) {
			
			String firstLetter1 = String.valueOf(input.charAt(b));
			
			

			if (firstLetter1.equals("0"))
				x[b]=0;
			if (firstLetter1.equals("1"))
				x[b]=1;

			
			
			
			a = a + (c * x[b]);
			c = c * 2;
			
 			

		}
		System.out.println(a);

	}
}
