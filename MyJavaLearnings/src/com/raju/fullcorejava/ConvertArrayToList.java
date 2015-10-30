package com.raju.fullcorejava;

import java.util.Arrays;
import java.util.List;
public class ConvertArrayToList {
	
	public static void main(String arg[])
	{
		String[] a = new String[5];
		a[0] = "0";
		a[1] = "1";
		a[2] = "2";
		
		List<String> l = Arrays.asList(a);
		
		System.out.println("size of array " + l.size());
		System.out.println(l);
		
		
	}

}
