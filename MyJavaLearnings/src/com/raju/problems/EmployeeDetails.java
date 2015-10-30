package com.raju.problems;

import java.util.Vector;

public class EmployeeDetails {
	
		int empid;
		String name;
		Vector<Integer> managers;
		
		public EmployeeDetails(int id, String name, Vector<Integer> mgrs) {
			// TODO Auto-generated constructor stub
			this.empid = id;
			this.name = name;
			this.managers = mgrs;			
		}
	}
