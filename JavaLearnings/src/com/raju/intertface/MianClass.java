package com.raju.intertface;

import com.raju.abstaction.InterfaceA;

public class MianClass {

	public static void main(String arg[]) {
		
		Interface1 obj1 = new ImplementClass();
		
		obj1.intMethod2();
		obj1.itrMethod1();
		
		InterfaceA obj2 = new ImplementClass();
		
		obj2.age();
		obj2.color();
		
		ImplementClass obj3 = new ImplementClass();
		
		obj3.age();
		obj3.color();
		obj3.itrMethod1();
		obj3.intMethod2();
	}
}
