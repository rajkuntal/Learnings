package com.raju.stringproblems;

public class FibonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = fibonic(6);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static int[] fibonic(int count) {
		int i = 1;
		int j = 1;
		int k;
		int[] fib = new int[count];
		if(count == 1)
			fib[0] = i;
		
		if(count >= 2)
		{
			fib[0] = i;
			fib[1] = j;
			count = count-2;
			int n = 2;
			while(count > 0)
			{
				fib[n] = fib[n-1] + fib[n-2];
				count--;
				n++;
			}
		}
		
		return fib;
			
	}

}
