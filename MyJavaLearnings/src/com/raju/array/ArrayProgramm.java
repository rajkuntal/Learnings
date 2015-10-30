package com.raju.array;

public class ArrayProgramm {
	
	static int[] arr = new int[100];
	
	static int size = 0;
	
	private void insertAtLast(int element){
		
		arr[size] = element;
		size++;
	}
	
	public void insertAtFirst(int e){
		int i = size;
		if (size == 0)
			arr[size] = e;
		else
		{
			while(i>=0)
			{
				arr[i+1] = arr[i];
				i--;
			}
			arr[0] = e;
		}
		size ++;
	}
	
	public void insertAtPos(int e, int pos){
		if(pos > size)
			arr[pos] = e;
		else
		{
			int j = size;
			while (j >= pos)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[pos] = e;
		}
		
		size ++;	
	}
	
	public static void main(String arg[] ){
		
		ArrayProgramm a = new ArrayProgramm();
		
		a.insertAtLast(2);
		a.insertAtLast(4);
		a.insertAtLast(5);
		a.insertAtFirst(6);
		a.insertAtPos(8,3);
		int i =0;
		while(i <= size)
		{
			System.out.print(arr[i] + " ");
			i++;
		}
	}

}
