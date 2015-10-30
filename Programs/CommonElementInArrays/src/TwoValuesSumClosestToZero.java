
public class TwoValuesSumClosestToZero {
	
	static int[] a = {-2,5,8,9,11,12};
	
	public static void main(String[] args) {
		
		int i = 0;
		int j =0, k=0;
		
		while(i < a.length)
		{
			if(i == 0)
			{
				j = a[i];
				k = a[i+1];
				i = i+2;
			}
			else if(a[i] < i && j > k)
			{
				j = a[i];
				i++;
			}
			else if (a[i] < j && k > j)
			{
				k = a[i];
				i++;
			}
			else
				i++;
		}		
		System.out.println(j+","+k);
	}

}
