package linkedListProblems;

import singlyLinkedList.SinglyLLNode;

public class FindNthNodeFmEndInLLUse2Pointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpmtStackUsingLL obj = new ImpmtStackUsingLL();
		FindNthNodeFmEndInLLUse2Pointers fobj = new FindNthNodeFmEndInLLUse2Pointers();
		obj.PUSH(10);
		obj.PUSH(20);
		obj.PUSH(5);
		obj.PUSH(2);
		obj.PUSH(53);
			
		fobj.findElement(4, obj);

	}
	
	public void findElement(int i, ImpmtStackUsingLL obj){
		SinglyLLNode p1 = obj.head;
		SinglyLLNode p2 = obj.head;
		int length = 1;
		
		while(p1.getNext() != null)
		{
			if(length < i)
			{
				p1 = p1.getNext();
				length++;
			}
			else
			{
				p1 = p1.getNext();
				p2 = p2.getNext();
				length++;
			}
		}
		System.out.println(p2.getData());
		
	}
	

}
