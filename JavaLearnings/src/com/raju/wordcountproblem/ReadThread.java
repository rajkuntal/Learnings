package com.raju.wordcountproblem;

import java.util.Map;

public class ReadThread implements Runnable {
	
	String[] sArr;
	Map<String, Integer> m;
	
	public ReadThread(String[] a, Map<String, Integer> cm) {
		// TODO Auto-generated constructor stub
		sArr = a;
		m = cm;
	}
	
	public void run(){
		for(int i = 0; i < sArr.length; i++ )
		{
			if(!m.containsKey(sArr[i]))
				m.put(sArr[i], 1);
			else
				m.put(sArr[i], m.get(sArr[i])+1);
		}
		
	}

}
