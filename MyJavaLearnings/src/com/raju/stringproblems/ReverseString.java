package com.raju.stringproblems;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverse("abcdefgh"));
		
		System.out.println(usingArray("abcdefgh"));
	}
	
	public static String reverse(String s) {
	
		if(s.length() < 2)
			return s;
		else
			return reverse(s.substring(1)) + s.charAt(0);
	}
	
	public static String usingArray(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		char[] c = s.toCharArray();
		int i = c.length-1;
		while(i>=0)
		{
			sb.append(c[i]);
			i--;
		}
		
		return sb.toString();
	}

}
