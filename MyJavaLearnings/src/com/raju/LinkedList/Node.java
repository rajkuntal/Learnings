
package LinkedList;

public class Node {
	
	Node next;
	private int v;
	
	Node(int data)
	{
		v = data;
		next = null;
	}
	
	public int getValue(){
		
		return v;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setValue(int vl){
		v = vl;
	}
	
	public void setNext(Node n){
		next = n;
	}

}
