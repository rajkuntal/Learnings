package com.raju.singleton;

public class StaticBlockSingleton {

	public static StaticBlockSingleton instence = null;
	
	private StaticBlockSingleton() {}
	
	static{
		if(instence == null)
			instence = new StaticBlockSingleton();
	}
	
	public StaticBlockSingleton getInstence() {
		return instence;
		
	}
}
