package com.raju.wordcountproblem;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file = "C:/Users/Raj Kumar/Desktop/WordCount/dataAnalysis.txt";
		String outDest = "C:/Users/Raj Kumar/Desktop/WordCount/newFiles/";
		int nof = 0 ;
		
		Map<String, Integer> m = new ConcurrentHashMap<>();
		
		LoadTextFile fObj = new LoadTextFile();
		try {
			nof = fObj.breakFile(file, outDest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread[] threads = new Thread[nof];
		
		if(nof > 1)
		{
			for(int i = 0; i < nof; i++)
			{
				try {
					threads[i] = new Thread(new ReadThread((fObj.readFile(outDest + "File" + (i+1) + ".txt")).split(" "), m));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				threads[i].start();
				
			}
		}
		
		CountComparator bvc = new CountComparator(m);
        Map<String, Integer> sorted_map = new TreeMap(bvc);
        Set<String> s = sorted_map.keySet();
        
        sorted_map.putAll(m);
        for(Iterator<String> it = s.iterator(); it.hasNext();)
        System.out.println(it.next() + " : " + sorted_map.get(it.next()));

	}

}
