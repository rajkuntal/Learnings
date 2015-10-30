package com.raju.singleton;

public class EagerInitiallizationSingleton {
	
	public static final EagerInitiallizationSingleton instence = new EagerInitiallizationSingleton();
	
	private EagerInitiallizationSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public EagerInitiallizationSingleton getInstence() {
		return instence;		
	}
}
