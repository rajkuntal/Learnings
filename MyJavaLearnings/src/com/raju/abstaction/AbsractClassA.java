package com.raju.abstaction;

abstract public class AbsractClassA implements InterfaceA {
	
	public void name() {
		System.out.println("Display My name");
	}
	

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("display color");		
	}
	
	abstract public void company();
}
