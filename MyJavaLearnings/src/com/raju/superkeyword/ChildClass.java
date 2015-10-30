package com.raju.superkeyword;

public class ChildClass extends ParentClass {

	int chd;
	
	public ChildClass(int c) {
		// TODO Auto-generated constructor stub
		super();
		chd = c;		
	}
	
	public ChildClass(int c, int p) {
		// TODO Auto-generated constructor stub
		super(p);
		chd = c;		
	}
	
	public void display() {
		System.out.println("Parent :" + par + " Child :"+ chd);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj1 = new ChildClass(10);
		ChildClass obj2 = new ChildClass(5, 5);
		
		obj1.display();
		obj2.display();
	}

}
