package com.raju.problems;

public final class ImmutableClassExample {
	
	private final int id;
	private final String name;
	
	public ImmutableClassExample(int i, String s) {
		// TODO Auto-generated constructor stub
		id = i;
		name = s;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
