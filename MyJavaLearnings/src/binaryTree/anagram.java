package binaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {
    	ArrayList<String> arr = new ArrayList<String>();
		Scanner nn = new Scanner(System.in);
        System.out.println("Enter number of actions");
        int N = nn.nextInt();
        int i = 0;
        for (i = 0; i < N; i++) {
            System.out.println("Enter your strings of"+N+" action");
            arr.add(nn.next());
            arr.add(nn.next());
        }        
        nn.close();
        anagram.IsAnagram(arr, N);
	}
    
	public static void IsAnagram(ArrayList<String> a, int act)	
	{
		int i ,j;
		for( i = 0; i < a.size()-1; i = i+2)
		{
			j = i + 1;
			if(checkAnagram(a.get(i), a.get(j)))
				System.out.println("YES");
			else
				System.out.println("NO");			
		}		
	}
	
	public static boolean checkAnagram(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		int len = s1.length();
		int len1 = s2.length();
		if (len < len1)
			return false;
		int j,k,l=0;
		for (int i = 0; i < len; i++) {
			if(i == 0 || l == 1)
			{
				l = 0;
				for(j = 0, k = len1-1; j <= len1/2; j++,k-- )
					if(s1.charAt(i) == s2.charAt(j) || s1.charAt(i) == s2.charAt(k))
					{
						l = 1;
						break;
					}
			}
		}
		return true;
	}
}
