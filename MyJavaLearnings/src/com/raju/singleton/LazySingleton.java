package com.raju.singleton;

public class LazySingleton {
	
	private static LazySingleton instence = null;
	
	private LazySingleton() {}
	
	public LazySingleton instence() {
		if(instence == null)
			instence = new LazySingleton();
		return instence;
		
	}

}
