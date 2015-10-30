package com.raju.linkedListProblems;

import com.raju.singlyLinkedList.SinglyLLNode;

public class ImpmtStackUsingLL {
	SinglyLLNode head;
	SinglyLLNode tail;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpmtStackUsingLL obj = new ImpmtStackUsingLL();
		obj.PUSH(10);
		obj.PUSH(20);
		obj.PUSH(5);
		
		obj.POP();
		obj.POP();
		obj.POP();
		obj.POP();
		
		obj.traversLL();
	}
	
	public void traversLL(){
		SinglyLLNode tmp = head;
		if(tmp == null)
		{
			System.out.println("list is Empty");
		}
		else
		{
			while(tmp.getNext() != null)
			{
				System.out.println(tmp.getData());
				tmp = tmp.getNext();
			}
			System.out.println(tmp.getData());
		}
	}
	
	public void PUSH(int d)
	{
		SinglyLLNode n = new SinglyLLNode(d);
		if(this.head == null)
		{
			this.head = n;
			this.tail = n;
		}
		else
		{
			tail.setNext(n);
			tail = n;
		}
	}
	
	public void POP()
	{
		SinglyLLNode tmp = head;
		if(tmp == null)
		{
			System.out.println("can not remove item bcs List is Empty");
		}
		else if (tmp.getNext() == null)
		{
			head = null;
			tail = null;
		}
		else
		{
			while(tmp.getNext() != tail)
			{
				tmp = tmp.getNext();
			}
			tail = tmp;
			tail.setNext(null);
		}
	}

}
