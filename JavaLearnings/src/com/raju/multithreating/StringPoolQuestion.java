package com.raju.multithreating;

public class StringPoolQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "ping";
		String s2 = new String("ping");
		String s3 = "ng";
		
		System.out.println(s1 == s2);
		
		System.out.println(s1 == "pi" +s3);
		
		System.out.println(s1.intern() == "pi" +s3.intern());
		
		System.out.println(s1.intern() == ("pi" +s3).intern());
		
		System.out.println(s1.intern() == s2.intern());

	}

}
