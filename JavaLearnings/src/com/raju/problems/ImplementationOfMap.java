package com.raju.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImplementationOfMap {
	
	public static void main(String[] args) {
		
		Map<Car,String> m = new HashMap<>();
		
		m.put(new Car("alto", 255862), "alto");
		m.put(new Car("alt", 255862), "alto");
		
		System.out.println(m.get(new Car("alto", 255862)));
		
		Set<Car> s = m.keySet();
		
		for(Car c : s)
			System.out.println(c +"==>" + m.get(c) + " And Key :" + m.hashCode());
	}
}
