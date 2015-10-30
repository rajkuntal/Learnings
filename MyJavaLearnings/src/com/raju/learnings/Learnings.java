package com.raju.learnings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Learnings {
	
	public static void main(String[] args) {
		
		List<Integer> ll = new ArrayList<Integer>();
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		hashset.add(10);
		hashset.add(20);
		hashset.add(30);
		
		if(hashset.add(10))
		{
			System.out.println("Element added");
		}
		
		System.out.println(hashset);
	}

}
