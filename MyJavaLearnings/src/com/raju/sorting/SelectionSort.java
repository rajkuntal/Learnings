package com.raju.sorting;

public class SelectionSort {
	
static int[] arr = {9,7,4,2,67,-54,65,87,98,76};
	
	public static void main(String arg[]){
		int s = arr.length;
		
		for(int i=0; i < s -1; i++)
		{
			int min = i;
			for(int j=i; j < s; j++)
			{	
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			int t = arr[i];
			arr[i] = arr[min];
			arr[min] = t;
		}
		
		for(int k =0; k<s; k++)
		{
			if(k==s-1)
				System.out.print(arr[k]);
			else
				System.out.print(arr[k] + ", ");
		}
	}

}
