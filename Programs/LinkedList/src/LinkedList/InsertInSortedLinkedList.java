package LinkedList;

public class InsertInSortedLinkedList {

	private Node head = null;
	Node node;
	public void addNode(int v) {
		// TODO Auto-generated method stub
				
		if(head == null)
		{
			head = new Node(v);
		}
		else
		{
			Node  last = null;
			for(node = head;  node != null && node.getValue() == v;)
			{
				last = node;
				node = node.getNext();
			}
			
			Node newNode = new Node(v);
			last.setNext(newNode);
			newNode.setNext(node);
		}

	}
	
	public static void main(String arg[])
	{
		InsertInSortedLinkedList n = new InsertInSortedLinkedList();
		n.addNode(10);
		n.addNode(20);
		//System.out.println(n);
	}

}
