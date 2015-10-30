package doublyLinkedList;

public class ImplementDoublyLinkedList
{
	DoublyLLNode head = null;
	DoublyLLNode tail = null;
	
	public void addNode(int d)
	{
		DoublyLLNode Node = new DoublyLLNode();
		Node.data = d;
		if(head == null)
		{
			head = Node;
			tail = Node;
		}
		else if(head == tail)
		{
			head.setNext(Node);
			Node.setPrev(head);
			tail = Node;			
		}
		else
		{
			Node.setPrev(tail);
			tail.setNext(Node);
			tail = Node;
		}
	}
	public void addNodeAtFirstPos(int d)
	{
		DoublyLLNode node = new DoublyLLNode();
		node.data = d;
		if(this.head == null)
		{
			head = node;
			tail = node;
		}
		else
		{
			node.setNext(head);
			head.setPrev(node);
			head = node;
		}
	}
	public void addNodeAtGivenPos(int d, int pos)
	{
		DoublyLLNode curr = this.head;
		DoublyLLNode tmpP = null;
		DoublyLLNode tmpN = null;
		
		int position = 1;
		
		if (head == null)
		{
			System.out.println("list is Empty");
		}
		else
		{
				while(curr != null)
				{
					if(position > pos)
					{
						System.out.println("position not available");
						break;
					}
					else
					{
						if(curr.getNext() == null)
						{
							if( curr.getPrev() != null)
							{
								tmpP = curr.getPrev();
							}
							tmpN = curr;
							break;
						}
						else
						{
							tmpP = curr.getPrev();
							tmpN = curr;
							curr = curr.getNext();
							position++;
						}
				}
			}
		}
		if(curr == null)
		{
			System.out.println("Given position is not available");
		}
		else if(pos == 1)
		{
			this.addNodeAtFirstPos(d);
		}
		else if(tmpP != null && tmpN.getNext() == null)
		{
			this.addNode(d);
		}
		else
		{
			DoublyLLNode n = new DoublyLLNode();
			n.data = d;
			tmpP.setNext(n);
			n.setPrev(tmpP);
			n.setNext(tmpN);
			tmpN.setPrev(n);
		}
		
	}
	
	
	public void traverse() throws Exception
	{
		DoublyLLNode Node = this.head;
		while(Node != null)
		{
			System.out.println(Node.getdata() + " Next Node : " + Node.getNext() + "::: Prev Node : " + Node.getPrev());
			if(Node.getNext() == null)
			{
				throw new Exception("Next Node is empty");
			}
			else
			{
				Node = Node.getNext();
			}
		}
	}
	public static void main(String[] arg)
	{
		ImplementDoublyLinkedList Obj = new ImplementDoublyLinkedList();
		Obj.addNode(10);
		Obj.addNode(20);
		Obj.addNode(25);
		Obj.addNodeAtFirstPos(30);
		Obj.addNodeAtGivenPos(40,1);
		try {
			Obj.traverse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
	}
}
