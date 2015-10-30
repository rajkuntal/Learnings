package com.raju.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instence = null;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstence() {
		if(instence == null)
			instence = new ThreadSafeSingleton();
		
		return instence;
		
	}

}
