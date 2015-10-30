package com.raju.fullcorejava;
import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> al = new ArrayList<String>();
        al.add("java2novice");
        al.add("for each");
        al.add("java 1.5");
        al.add("www.java2novice.com");
        /**
         * during each iteration, the object in the sequence
         * will be assigned to string reference str.
         */
        for(String str:al){
            System.out.println(str);
        }
	}

}
