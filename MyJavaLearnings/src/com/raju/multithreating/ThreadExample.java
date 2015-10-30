package com.raju.multithreating;

public class ThreadExample implements Runnable {

	 int i = 0;

	public void run() {

		for(;i<4;i++)
		{
			
			System.out.println("Current thread is "+Thread.currentThread().getThreadGroup().getName());
		}
	}
}
