package com.raju.fullcorejava;
public class PermutationWords {
    
	public static void main(String[] args) {
		String firstString = "EACBD";
		String secondString = "EABCD"; 
		
		//permutation(firstString,secondString);
	}
	
	/*static int count =0;
	protected static void permutation(String firstString, String secondString){
		printPermutation(firstString,"",secondString);
	}
	protected static void printPermutation(String firstString, String permutation, String secondString){
		if(firstString.length() == 0){
			if(permutation.equals(secondString)){
				System.out.println(count);
			}
			else{
				count++;
			}
			return;
		}
		for(int i=0;i<firstString.length();i++){
			char toAppendToPermutation = firstString.charAt(i);
			String remaining = firstString.substring(0,i) + firstString.substring(i+1);
			
			printPermutation(remaining, permutation+toAppendToPermutation, secondString);
		}
	}*/
}