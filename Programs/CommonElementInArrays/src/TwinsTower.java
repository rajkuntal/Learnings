
public class TwinsTower {
	public static void main (String[] args)
	{
		int m =14;
		int n = (2*m) + 1;
		for(int i=1; i<=(n/2)+1 ; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if( j <=i || j > (n-i) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}

}
