package com.raju.abstaction;

public class ChildClass extends AbsractClassA {

	@Override
	public void company() {
		// TODO Auto-generated method stub
		System.out.println("Company Abstract Method");
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("Display age");		
	}
	
	public void childClassMethod() {
		System.out.println("method name :"+getClass());
	}

}
