package com.raju.problems;

import java.util.HashMap;
import java.util.Map;

public class Car {
	
	private String name;
	private double price;
	
	Car(String nm, double p){ this.name = nm; this.price = p; }
	
	public int hashCode(){
		int hashcode = 0;
		double p = this.price;
		while(p%10 > 0)
		{
			hashcode = (int) (hashcode + (p % 10));
			p = p/10;
		}
		return hashcode;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Car))
		      return false;
		    if (obj == this)
		      return true;
		    return  this.name == ((Car) obj).name &&
		            this.price == ((Car) obj).price;
	}

	public String toString() {
		return "Car :"+this.name+" And Rate : "+this.price;
	}
	
	public static void main(String[] args) {
		
		Map m = new HashMap<>();
		
		m.put(new Car("alto", 2222),  "alto");
		
		System.out.println(m.get(new Car("alto", 2222)));
	}
}
