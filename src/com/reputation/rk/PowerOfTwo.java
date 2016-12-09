package com.reputation.rk;

public class PowerOfTwo {
	
public static void main(String args[]) {
		
		int sum=0;
		int n = 5;
		
		for(int i=1;i<=n;i++)
		{
			sum=(int) (sum+Math.pow(2,i));
			
		}
		System.out.println(sum);
	}

}
