package com.raju.abstaction;

public class ClassWithMain {
	
	public static void main(String arg[]) {
		InterfaceA obj = new ChildClass();
		
		obj.age();
		obj.color();
		
		AbsractClassA obj1 = new ChildClass();
		
		obj1.company();
		obj1.name();
		
		ChildClass obj2 = new ChildClass();
		
		obj2.childClassMethod();		
	}
}
