package com.raju.array;

public class MajorityElement {
	
static int[] arr = {1,3,3,1};
	
	public static void main(String arg[]){
		int s = arr.length;
		int count =1;
		int e = 0;
		
		for(int i = 0; i <= (s/2)+1; i++)
		{
			count =1;
			for(int j = i+1; j < s; j++)
			{
				if(count < (s/2))
				{
					if (arr[i] == arr[j])
					{
						count++;
						e = arr[i];
					}
						
				}
				else
				{
					break;
				}
			}
			if(count > (s/2))
				break;
		}
		
		System.out.println(e);
	}

}
