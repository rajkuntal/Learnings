package com.raju.wordcountproblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LoadTextFile {

	public String readFile( String file ) throws IOException {
	    BufferedReader reader = new BufferedReader( new FileReader(file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    while( ( line = reader.readLine() ) != null ) {
	        stringBuilder.append( line );
	        stringBuilder.append( ls );
	    }

	    return stringBuilder.toString();
	}
	
	public int breakFile(String file, String optDest) throws IOException {
		int nol = 0;
		int bnl = 300;
		int nof = 0;
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		/*while(br.readLine() != null)
			nol++;*/
		nol = readLinesInfiles(file);
		//get number of files
		if(nol > bnl)
			nof = (nol/bnl) + 1;
		else
			nof = 1;
		String ln;
		
		for(int i = 1; i<= nof; i++)
		{
			FileWriter fw = new FileWriter(optDest + "File" + i + ".txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int j = 1; j<= bnl ; j++)
			{
				ln = br.readLine();
				if(ln != null)
					bw.write(ln);
				if(j != bnl)
					bw.newLine();
			}
			bw.close();
		}
		return nof;
	}
	
	public int readLinesInfiles(String file) throws IOException
	{
		FileReader fr = new FileReader(file);
		LineNumberReader lnr = new LineNumberReader(fr);
		lnr.skip(Long.MAX_VALUE);
		return (lnr.getLineNumber()+1);
	}
	
	public static void main(String[] args) {
		
		String s ="";
		String file = "C:/Users/Raj Kumar/Desktop/WordCount/dataAnalysis.txt";
		String outDest = "C:/Users/Raj Kumar/Desktop/WordCount/newFiles/";
		
		LoadTextFile obj = new LoadTextFile();
		try {
			s = obj.readFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String, Integer> m = new HashMap<>();
		
		String[] as = s.split(" ");
		for(int i=0; i<as.length; i++)
		{
			if(!m.containsKey(as[i]))
				m.put(as[i], 1);
			else
				m.put(as[i], m.get(as[i])+1);
		}
		for(String s1 : m.keySet())
		System.out.println(s1 + " : " + m.get(s1));
	}
	
}
