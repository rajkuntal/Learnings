package LinkedList;


public class SinglyLinkList {
	
	private SinglyLinkList next;
	private String data = null;
	
	public String getData()
	{
		return data;
	}
	
	public SinglyLinkList getNext()
	{
		return this.next;
	}
	
	public void setData(String data)
	{
		this.data = data;
	}
	
	public SinglyLinkList setNext(SinglyLinkList node)
	{
		return this.next = node;
	}
}

class SubClassImplementLinkedListClasss
{
	
	SinglyLinkList head;
	SinglyLinkList tail;
	
	//Add Nodes at last
	public void AddItem(String data)
	{
		SinglyLinkList node = new SinglyLinkList();
		node.setData(data);
		
		if(head == null)
		{
			head = node;
			tail = node;
		}
		else
		{
			tail.setNext(node);
			tail = node;
		}
	}
	
	//insert at beginning in LinkedList
	public void insertAtBeginning(String data)
	{
		SinglyLinkList node = new SinglyLinkList();
		SinglyLinkList temp;
		node.setData(data);
		
		if(head == null)
		{
			head = node;
			tail = node;
		}
		else
		{
			temp = head;
			head = node;
			node.setNext(temp);
		}
	}
	
	
	// traverse a List
	public void travrseList()
	{
		SinglyLinkList currentNode = this.head;
		while(currentNode != null)
		{
			System.out.println(currentNode.getData() + " : " + currentNode.getNext());
			currentNode = currentNode.getNext();
		}		
	}
	
	//create a Node in list
	public static void main(String arg[])
	{
		SubClassImplementLinkedListClasss listObj = new SubClassImplementLinkedListClasss();
		listObj.AddItem("aa");
		listObj.AddItem("bb");
		//listObj.insertAtBeginning("AA");
		//listObj.insertAtBeginning("BB");
		listObj.travrseList();
	}
	

}
