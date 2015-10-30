package com.raju.fullcorejava;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CreateNotepadFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 1000; i++)
		{
			PrintWriter writer1 = null;
			try {
				writer1 = new PrintWriter("the-file-name-"+ i +".txt", "UTF-8");
				System.out.println("Creating the directory using saperate thredid :" + Thread.currentThread().getId());
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			writer1.println("The first line");
			writer1.println("The second line");
			writer1.close();
	}
	}
}
