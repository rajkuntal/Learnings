import java.util.LinkedList;
import java.util.Iterator;

public class BasicOperation {
	
	public static void main (String arg[])
	{
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("AA");
		ll.add("BB");
		
		System.out.println("ll Size = " +ll.size());
		System.out.println("ll Size = " +ll);
		
		@SuppressWarnings("unchecked")
		LinkedList<String> lc = (LinkedList<String>) ll.clone();
		
		lc.add("CC");
		
		System.out.println("ll Size = " +lc.size());
		System.out.println("ll Size = " +lc);
		
		//Object v = lc.indexOf("CC");
		
		Object v = lc.contains("CD");
		
		System.out.println("v : " + v);
		
		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
