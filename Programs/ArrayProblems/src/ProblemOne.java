
public class ProblemOne {

	public static boolean goOn = false;
	static int s =0;
	
	static
	{
		increment();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increment();
		
		System.out.println("s : "+ s);
	}
	
	public static void increment() {
		if(!goOn)
		{
			for(int i = 0 ; i <= 10; i++)
			{
				s = s + i;
			}
			goOn = true;
		}
	}

}
