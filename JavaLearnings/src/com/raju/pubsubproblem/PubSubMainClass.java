package com.raju.pubsubproblem;

import java.util.ArrayList;
import java.util.List;

public class PubSubMainClass {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		int s = 5;
		Thread tProd = new Thread(new Producer(l, s), "Produce");
		
		Thread tCons = new Thread(new Consumer(l), "Consumer");
		
		tProd.start();
		tCons.start();
	}

}