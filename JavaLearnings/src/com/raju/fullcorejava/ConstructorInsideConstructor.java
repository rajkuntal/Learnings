package com.raju.fullcorejava;

public class ConstructorInsideConstructor {
	     
	    public ConstructorInsideConstructor(){
	        System.out.println("In default constructor...");
	    }
	    public ConstructorInsideConstructor(int i){
	        this();
	        System.out.println("In single parameter constructor...");
	    }
	    public ConstructorInsideConstructor(int i,int j){
	        this(j);
	        System.out.println("In double parameter constructor...");
	    }
	     
	    public static void main(String a[]){
	    	ConstructorInsideConstructor ch = new ConstructorInsideConstructor(10,20);
	    }

}
