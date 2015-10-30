package com.raju.singleton;

public class BestThreadSafeSingleton {
		
	private static BestThreadSafeSingleton instence = null;
	
	private BestThreadSafeSingleton() {}
	
	public static  BestThreadSafeSingleton getInstence() {
		if(instence == null)
			synchronized (BestThreadSafeSingleton.class) {
				instence = new BestThreadSafeSingleton();
			}	
		
		return instence;
		
	}

}
