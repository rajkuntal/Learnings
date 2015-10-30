package com.raju.sorting;

public class InsertionSort {
	
static int[] arr = {9,7,4,2,67,-54,65,87,98,76};
	
	public static void main(String arg[]){
		int s = arr.length;
		
		int min =0, max= 0;
		for(min = 1; min < s; min++)
		{
			int key = arr[min];
			for(max = min-1; max  >= 0; max--)
			{
				if(arr[max] > key)
				{
					arr[max+1]=arr[max];
				}
				else
				{
					break;
				}
			}
			
			arr[max+1]=key;
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
