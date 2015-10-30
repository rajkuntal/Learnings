package linkedList;

public class SinglyLinkedList {
	
	private SinglyLinkedList next;
	private String data = null;
	
	public String getData()
	{
		return data;
	}
	
	public SinglyLinkedList getNext()
	{
		return this.next;
	}
	
	public void setData(String data)
	{
		this.data = data;
	}
	
	public SinglyLinkedList setNext(SinglyLinkedList node)
	{
		return this.next = node;
	}
}


