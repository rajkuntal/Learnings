package com.raju.multithreating;

public class BasicStaticBlock {

	static
	{
		ping();
	}
	static boolean isTrue = false;
	static int s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ping();
		System.out.println("S :" + s);

	}
	
	public static void ping() {
		int i = 0;
		while (!isTrue) {
			s = s + i;
			i++;
			if(i == 10)
				isTrue = true;
		}
	}

}
