package com.raju.array;

public class SingletonClass {

	private static SingletonClass obj = null;
	
	private SingletonClass() {};
	
	public static SingletonClass getInstence() {
		if(obj == null)
		{
			synchronized (SingletonClass.class) {
				if(obj == null)
					obj = new SingletonClass();
			}
		}		
		return obj;		
	}	
}
