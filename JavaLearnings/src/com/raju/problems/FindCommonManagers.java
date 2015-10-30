package com.raju.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class FindCommonManagers {
	
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		v1.add(202); v1.add(201); v1.add(102);
		
		EmployeeDetails emp1 = new EmployeeDetails(202, "Raj", v1);
		
		Vector<Integer> v2 = new Vector<>();
		v2.add(202); v2.add(201); v2.add(105);
		
		EmployeeDetails emp2 = new EmployeeDetails(202, "Raj", v2);
		
		Collections.sort(emp1.managers);
		Collections.sort(emp2.managers);
		
		List<Integer> commMgrs = new ArrayList<>();

		int l1 = 0,l2 = 0;
		while(l1 < emp1.managers.size() && l2 < emp2.managers.size())
		{
			System.out.println("emp1.managers.get(l1) " + emp1.managers.get(l1)+" emp2.managers.get(l2) "+ emp2.managers.get(l2));
			if(emp1.managers.get(l1).equals(emp2.managers.get(l2)))
			{
				commMgrs.add(emp1.managers.get(l1));
				l1++; l2++;
			}
			else if(emp1.managers.get(l1) > emp2.managers.get(l2))
				l2++;
			else
				l1++;				
		}
		
		System.out.println("Common Manages :" + commMgrs);
	}

}


