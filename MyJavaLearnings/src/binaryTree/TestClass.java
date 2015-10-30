package binaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
	
	public static void main(String args[] ) throws Exception {
        
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner nn = new Scanner(System.in);
        System.out.println("Enter number of actions");
        int N = nn.nextInt();
        int i = 0;
        for (i = 0; i < N; i++) {
            System.out.println("Enter your numbers for "+N+"action");
            arr.add(nn.nextInt());
            arr.add(nn.nextInt());
        }
        
        nn.close();
        TestClass obj = new TestClass();
        obj.calculate(arr, N);
    }
	
	public void calculate(ArrayList<Integer> a, int act)
	{
		int i ,j;
		for( i = 0; i < a.size()-1 ; i = i+2)
		{
			j = i + 1;
			System.out.print("Output of - "+a.get(i)+" && "+a.get(j)+" --> ");
			System.out.println(removeLeadingZeors(getReverseF(removeLeadingZeors(a.get(i))) + getReverseF(removeLeadingZeors(a.get(j)))));
		}		
	}
	
	public int removeLeadingZeors(int n) {
		if(n%10 == 0)
		{
			while(n > 0)
			{
				if(n%10 != 0)
					break;
				else
					n = n/10;						
			}
		}
		return n;
	}
	
	public int getReverseF(int num) {
		int fv = num % 10;
		int sv = 0;
		String s = Integer.toString(num);
		int sl = s.length();
		if(sl > 1)
		{			
			while(num > 0)
			{
				sv = num % 10;
				num = num/10;
			}
			if(sl > 2)
				return Integer.parseInt(Integer.toString(fv) + s.substring(1, sl-1) + Integer.toString(sv));
			else
				return Integer.parseInt(Integer.toString(fv) + Integer.toString(sv));
		}
		else
			return num;
	}
}
