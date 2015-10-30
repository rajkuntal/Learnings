import java.util.Arrays;
import java.util.List;
public class ArrayBinarySearch {
	
	public static void main(String arg[])
	{
		String[] a = new String[5];
		a[0] = "0";
		a[1] = "1";
		a[2] = "2";
		
		List<String> l = Arrays.asList(a);
		
		System.out.println("size of array " + l.size());
		System.out.println(l);
		
		int index = Arrays.binarySearch(a, "1");
		System.out.println(index);
		
		
	}

}

