package com.raju.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListVsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List is ordered
		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(5);
		l.add(10);
		l.add(2);
		
		for(int i : l)
			System.out.print(i+" ");
		
		//Set is un-ordered
		Set<Integer> s = new HashSet<>();
		
		s.add(1);
		s.add(10);
		s.add(6);
		s.add(1);
		s.add(2);
		s.add(6);
		s.add(2);
		
		System.out.println();
		for (int i : s)
			System.out.print(i+" ");
		
		Map<String, String> m = new HashMap<>();
			m.put("abc", "hello");
			m.put("bcd", "hello1");
			m.put("abc", "hello2");
			
			System.out.println();
			System.out.print(m);
				
		
	}

}
