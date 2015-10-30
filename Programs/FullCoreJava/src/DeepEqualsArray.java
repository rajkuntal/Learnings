import java.util.Arrays;
public class DeepEqualsArray {
	
	public static void main(String arg[])
	{
		String[] s1 = {"A", "B"};
		String[] s2 = {"A", "B"};
		
		boolean a = Arrays.deepEquals(s1, s2);
		
		System.out.println(a);
				
	}

}
