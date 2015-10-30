package linkedListProblems;

import java.util.HashMap;
import java.util.Map;

import singlyLinkedList.SinglyLLNode;
import linkedListProblems.ImpmtStackUsingLL;

public class FindNthNodeFmEndInLLUseHashMap {

	Map<Integer, Integer> m = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpmtStackUsingLL obj = new ImpmtStackUsingLL();
		FindNthNodeFmEndInLLUseHashMap fobj = new FindNthNodeFmEndInLLUseHashMap();
		obj.PUSH(10);
		obj.PUSH(20);
		obj.PUSH(5);
		obj.PUSH(2);
		obj.PUSH(53);
		
		fobj.traversLLIntoMap(obj);		
		fobj.findNthElement(5);

	}
	
	public void findNthElement(int i)
	{		
		System.out.println(m.get(m.size()-i+2));
	}
	
	public void traversLLIntoMap(ImpmtStackUsingLL o){
		SinglyLLNode tmp = o.head;
		int i = 1;
		if(tmp == null)
		{
			System.out.println("list is Empty");
		}
		else
		{
			while(tmp.getNext() != null)
			{
				this.m.put(i++, tmp.getData());
				tmp = tmp.getNext();
			}
			this.m.put(i, tmp.getData());
		}
	}

}
