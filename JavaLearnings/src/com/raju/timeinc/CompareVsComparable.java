package com.raju.timeinc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

import com.raju.timeinc.CompareVsComparable.Employee;

import java.util.TreeMap;

public class CompareVsComparable {
	
	class Employee implements Comparable<Employee>{
		int id;
		String name;
		int salary;
		
		public Employee(int i, String n, int s) {
			// TODO Auto-generated constructor stub
			id = i;
			name = n;
			salary = s;
		}
		
		public int compareTo(Employee obj) {
			return(obj.id - this.id);
		}
		
		public String toString() {
			return("Id :"+ id+"; Name +"+ name + "; Salary "+ salary);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Employee> nameComp = new Comparator<CompareVsComparable.Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (o1.name.codePointAt(0) - o2.name.codePointAt(0));
			}
		};
		
		CompareVsComparable obj = new CompareVsComparable();
		
		Map<Employee, String> m = new TreeMap<>(nameComp);
		
		Map<Employee, String> hm = new HashMap<>();
		
		List<Employee> ll = new ArrayList<Employee>();
		ll.add(obj.new Employee(5, "Raj", 50000));
		ll.add(obj.new Employee(2, "Harry", 60000));
		ll.add(obj.new Employee(3, "ND", 20000));
		ll.add(obj.new Employee(1, "Monu", 10000));
		
		Collections.sort(ll);
		
		System.out.println("List : " + ll);
		
		m.put((obj.new Employee(5, "Raj", 50000)), "A");
		m.put((obj.new Employee(2, "Harry", 60000)), "C");
		m.put((obj.new Employee(3, "ND", 20000)), "D");
		m.put((obj.new Employee(1, "Monu", 10000)), "B");
		
		for(Entry<Employee, String> e : m.entrySet())
		{
			System.out.println("Key :"+ e.getKey() +" Value :"+e.getValue());
		}
		
		hm.put((obj.new Employee(5, "Raj", 50000)), "A");
		hm.put((obj.new Employee(2, "Harry", 60000)), "C");
		hm.put((obj.new Employee(3, "ND", 20000)), "D");
		hm.put((obj.new Employee(1, "Monu", 10000)), "B");
		
		Set<Entry<Employee, String>> s = hm.entrySet();
		
		List<Entry<Employee, String>> lhm = new ArrayList<Entry<Employee, String>>(s);
		
		Comparator<Entry<Employee, String>> valueComp = new Comparator<Map.Entry<Employee,String>>() {
			
			@Override
			public int compare(Entry<Employee, String> o1, Entry<Employee, String> o2) {
				// TODO Auto-generated method stub
				return (o1.getValue().compareTo(o2.getValue()));
			}
		};
		
		Collections.sort(lhm, valueComp);
		
		Iterator<Employee>  e = m.keySet().iterator();
		while (e.hasNext()) {
			
			Map.Entry<Employee, String> eobj = ((Map.Entry<CompareVsComparable.Employee, String>)e.next());
			System.out.println("Key :" + eobj.getKey() + "Value :"+eobj.getValue());
			
		}
		
		
	}

}
