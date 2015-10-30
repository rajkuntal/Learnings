package com.raju.multithreating;

public class ImplementMyThread {
	
	public static void main(String[] arg){
	
	ThreadExample obj = new ThreadExample();
	
	ThreadGroup g1 = new ThreadGroup("G1");
	ThreadGroup g2 = new ThreadGroup("G2");
	ThreadGroup g3 = new ThreadGroup("G3");
	ThreadGroup g4 = new ThreadGroup("G4");
	ThreadGroup g5 = new ThreadGroup("G5");
	
	Thread t1 = new Thread(g1, obj);
	Thread t2 = new Thread(g1, obj);
	Thread t3 = new Thread(g2, obj);
	Thread t4 = new Thread(g2, obj);
	Thread t5 = new Thread(g3, obj);
	Thread t6 = new Thread(g3, obj);
	Thread t7 = new Thread(g4, obj);
	Thread t8 = new Thread(g4, obj);
	Thread t9 = new Thread(g5, obj);
	Thread t10 = new Thread(g5, obj);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	
	}
}
