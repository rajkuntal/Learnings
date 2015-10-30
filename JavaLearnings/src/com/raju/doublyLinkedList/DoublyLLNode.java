package doublyLinkedList;

public class DoublyLLNode {
	public int data;
	public DoublyLLNode next;
	public DoublyLLNode prev;

	public DoublyLLNode() {
		this.next = null;
		this.prev = null;
	}
	public void setData(int d)
	{
		this.data = d;
	}
	public void setNext(DoublyLLNode n)	{
		this.next = n;
	}
	public void setPrev(DoublyLLNode p)	{
		this.prev = p;
	}
	public int getdata()	{
		return this.data;
	}
	public DoublyLLNode getNext()	{
		return this.next;
	}
	public DoublyLLNode getPrev()	{
		return this.prev;
	}
}