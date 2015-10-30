
public class BubbleSort {
	
	static int[] arr = {1,4,2,67,54,65,87,98,76};
	
	public static void main(String arg[]){
		int s = arr.length;
		int i = 0;
		
		for(i = s-1; i>=0; i--)
		{
			for(int j = 0; j<i; j++)
			{
				int t = 0;
				
				if(arr[j] > arr[j+1])
				{
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
		for(int k =0; k<s; k++)
		{
			if(k==s-1)
				System.out.print(arr[k]);
			else
				System.out.print(arr[k] + ", ");
		}
	}

}
