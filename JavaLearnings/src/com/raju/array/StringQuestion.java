package com.raju.array;

public class StringQuestion {

	public static void main(String[] args) {
		
		String S1 = "Pingpong";
		
		String S2 = new String("Pingpong");
		
		String S3 = "pong";
		String S4 = "Ping" + S3;
		
		System.out.println(S1 == S2);
		
		System.out.println(S1 == S2.intern());
		
		System.out.println(S1.intern() == S2.intern());
		
		System.out.println(S1 == "Ping" + S3);
		
		System.out.println(S1.intern() == "Ping" + S3.intern());
		
		System.out.println(S1.intern() == ("Ping" + S3).intern());
		
		System.out.println(S1 == "Ping" + "pong");
		System.out.println(S1 == S4);
		System.out.println(S4.hashCode());
		System.out.println(S1.hashCode());
	}
}
