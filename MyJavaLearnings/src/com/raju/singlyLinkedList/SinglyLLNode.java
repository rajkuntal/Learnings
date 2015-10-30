package singlyLinkedList;

public class SinglyLLNode {
	
	public SinglyLLNode next;
	public int data;
	
	public SinglyLLNode(int d) {
		// TODO Auto-generated constructor stub
		this.next = null;
		this.data = d;
	}
		
	public int getData(){
		return this.data;
	}
	
	public SinglyLLNode getNext(){
		return this.next;		
	}
	
	public void setData(int d){
		this.data = d;
	}
	public void setNext(SinglyLLNode n){
		this.next = n;
	}
	

}
