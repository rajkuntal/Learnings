package com.raju.wordcountproblem;

import java.util.Comparator;
import java.util.Map;

public class CountComparator implements Comparator<String>{
	    Map<String, Integer> m;

	    public CountComparator(Map bm) {
	        this.m = bm;
	    }

	    // Note: this comparator imposes orderings that are inconsistent with
	    // equals.
		@Override
		public int compare(String a, String b) {
			if (m.get(a) >= m.get(b)) {
	            return -1;
	        } else {
	            return 1;
	        }
		}	
}
