package linkedList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LinkedListClassImplementation
{
	
	SinglyLinkedList head;
	SinglyLinkedList tail;
	
	//get length of linkedList
	public int getListLenght()
	{
		SinglyLinkedList temp = head;
		int i = 0;
		while(temp != null)
		{
			temp = temp.getNext();
			i++;
		}
		return i;
	}
	
	//Add Nodes at last
	public void AddItem(String data)
	{
		SinglyLinkedList node = new SinglyLinkedList();
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
		SinglyLinkedList node = new SinglyLinkedList();
		SinglyLinkedList temp;
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
	
	//insert at given position
	public void insrtAtGivenPosition(String s, int pos) throws Exception
	{
		SinglyLinkedList node = new SinglyLinkedList();
		node.setData(s);
		int i = 1;
		SinglyLinkedList currentNode = head;
		SinglyLinkedList preNode = null;
		
		if (currentNode == null && pos > 1)
		{
			throw new Exception("linked is empty and given position is greater than one");
		}
		else if (currentNode == null && pos == 1)
		{
			currentNode = null;
			preNode = null;
		}
		else if(pos == this.getListLenght()+1)
		{
			currentNode = null;
			preNode = tail;
		}
		else
		{
			while(i < pos)
			{
				if (currentNode == null)
				{
					throw new Exception("less number of nodes in LinledList");
				}
				else
				{
						preNode = currentNode;
						currentNode = currentNode.getNext();
						i++;
				}
			}
		}
		
		if(currentNode == null && pos == 1)
		{
			head = node;
			tail = node;
		}
		else
		{
			if(preNode == null && currentNode != null)
			{
				node.setNext(currentNode);
				head = node;
			}
			if(preNode != null && currentNode == null)
			{
				preNode.setNext(node);
				tail = node;
			}
			else
			{
				preNode.setNext(node);
				node.setNext(currentNode);
			}
		}		
	}
	
	//search an element in linkedList using recursion
	public void searchElement(SinglyLinkedList node ,String s)
	{
		if(node == null)
		{
			System.out.println("Not found");
		}
		else if(node.getData().toLowerCase() == s.toLowerCase())
		{
			System.out.println("found the element.");
		}
		else
		{
			this.searchElement(node.getNext(), s);
		}	
	}
	
	//get the Nth node
	public void getNthElement(int pos)
	{
		SinglyLinkedList node = head;
		int index = 1;
		while(index < pos)
		{
			node = node.getNext();
			index++;
		}
		System.out.println("Nth element is : " + node.getData());
	}
	
	//print middle of the linkedList
	public void printMiddleNode()
	{
		int length = this.getListLenght();
		if(length % 2 == 0)
		{
			this.getNthElement(length/2);
		}
		else
		{
			this.getNthElement((length/2)+1);
		}
		
	}
	
	//print middle of the linkedList using two pointers
	public void printMiddleusingTwoPointers()
	{
		SinglyLinkedList oneIncr = this.head;
		SinglyLinkedList dubbleIncr = this.head;
		if(oneIncr == null)
		{
			System.out.println("list is empty");
		}
		else
		{
			while(dubbleIncr != null)
			{
				if(dubbleIncr.getNext() == null)
				{
					break;
				}
				oneIncr = oneIncr.getNext();
				dubbleIncr = dubbleIncr.getNext().getNext();
			}
		}
		System.out.println("Middle element is :" + oneIncr.getData());
	}
	
	//print middle using recursion approach
	int length = 0;	
	PrintWriter pw = null;
	File file  = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	public void middleUsingRecursion(SinglyLinkedList h, int j) throws Exception
	{		
		//if(h != null)
		if(length <=7800)
		{
			if (length%200 == 0)
				System.out.println("hello");
			length ++;
			j++;
			//System.out.println(h.getData());
			
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/Rajkumar/Desktop/test/output.txt", true)))) {
			    out.println("Length:" + length);
			    
			}catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}		
			middleUsingRecursion(h, j);
			System.out.println(h.getData());
			
		}
		/*if(length != 0 && j == length/2)
		{
			System.out.println(h.getData());
		}*/
		//System.out.println(length+ " : " + j);
		
	}
	
	//print middle with another approach
	public void printMidlleByConsideringMidAsHead()
	{
		int i = 0;
		SinglyLinkedList node = head;
		SinglyLinkedList mid = head;
		while(node != null)
		{
			if(i % 2 != 0)
			{
				mid = mid.getNext();
			}
			
			node = node.getNext();
			i++;
		}
		
		System.out.println("Middle element using mid element as head is :" + mid.getData());
			
	}
	
	// traverse a List
	public void travrseList()
	{
		SinglyLinkedList currentNode = this.head;
		while(currentNode != null)
		{
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}		
	}
	
	//create a Node in list
	public static void main(String arg[])
	{
		LinkedListClassImplementation listObj = new LinkedListClassImplementation();
		listObj.AddItem("aa");
		listObj.AddItem("bb");
		listObj.insertAtBeginning("AA");
		listObj.insertAtBeginning("BB");
		
		try
		{
			listObj.insrtAtGivenPosition("5-pos", 5);
			listObj.insrtAtGivenPosition("3-pos", 3);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		//listObj.travrseList();
/*		listObj.searchElement(listObj.head, "a");
		listObj.printMiddleNode();
		listObj.printMiddleusingTwoPointers();
		listObj.printMidlleByConsideringMidAsHead();*/
		try {
			/*listObj.file  = new File("C:/Users/Rajkumar/Desktop/test/output.txt");
			listObj.fw = new FileWriter(listObj.file, true);
			listObj.bw = new BufferedWriter(listObj.fw);
			listObj.pw = new PrintWriter(listObj.bw);*/
			listObj.middleUsingRecursion(listObj.head, -1);
		} catch (Exception e) {
			/*listObj.pw.flush();
			listObj.pw.close();
			try {
				listObj.bw.close();
				listObj.fw.close();
				//listObj.file.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			
			
		}
	}
	

}
