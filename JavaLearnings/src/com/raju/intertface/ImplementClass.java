package com.raju.intertface;

import com.raju.abstaction.InterfaceA;

public class ImplementClass implements Interface1, InterfaceA {

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("Age");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("color");
	}

	@Override
	public void itrMethod1() {
		// TODO Auto-generated method stub
		System.out.println("itrMethod1");
	}

	@Override
	public void intMethod2() {
		// TODO Auto-generated method stub
		System.out.println("intMethod2");
	}
}
