package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementBinaryTree {

	BinaryTreeNode root = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementBinaryTree obj = new ImplementBinaryTree();
		
		obj.insertNode(1);
		obj.insertNode(2);
		obj.insertNode(3);
		obj.insertNode(4);
		obj.insertNode(5);
		obj.insertNode(6);
		obj.insertNode(7);
		obj.insertNode(8);
		
		System.out.println("Pre-Order");
		obj.preOrderTraverse(obj.root);
		
		System.out.println();
		System.out.println("In-Order");
		obj.inorder(obj.root);
		
		System.out.println();
		System.out.println("post-order");
		obj.postorder(obj.root);
		
		obj.getElement();
	}
	
	public void getElement()
	{
		System.out.println();
		System.out.println("Max Element using recurssion :" + searchMaxElement(this.root));
		System.out.println("Max Element without recurssion :" + searchMaxElementWithoutRec(this.root));
		searchElement(2, this.root);
		searchElement(25, this.root);
		System.out.println("Print in reverse order level : ");
		printTreeInReverseLevelOrder(this.root);
		System.out.println();
		System.out.println("Hight or depth of the tree : " + getHightRecurrsive(this.root));
		System.out.println("Minimum depth of the tree : " + findMinimumDepth(this.root));
		System.out.println("Pre-Order traversal without recurssion : ");
		preOrderWithoutRecc(this.root);
		System.out.println();
		System.out.println("In-Order traversal without recurssion : ");
		inOrderWORecc(this.root);
	}
	
	public void printRootNode(){
		System.out.println("Root Node : " + this.root.getData());
	}
	
	public void insertNode(int data) {
		this.root = insertNode(data, this.root);
	}
	
	private BinaryTreeNode insertNode(int data, BinaryTreeNode node){
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		
		if(node == null)
		{
			node = new BinaryTreeNode(data);
			return node;
		}
		else
		{
			q.offer(node);
		}
		while(!q.isEmpty())
		{
			BinaryTreeNode tmp = q.poll();
			if(tmp != null)
			{
				if(tmp.getLeftChild() != null)
				{
					q.offer(tmp.getLeftChild());
				}
				else
				{
					tmp.left = new BinaryTreeNode(data);
					return node;
				}
				
				if(tmp.getRightChild() != null)
				{
					q.offer(tmp.getRightChild());
				}
				else
				{
					tmp.right = new BinaryTreeNode(data);
					return node;
				}
			}
		}
		
		return node;
	}
	
	private void preOrderTraverse(BinaryTreeNode node){
		if(node != null)
		{
			System.out.print(node.getData() + " ");
			preOrderTraverse(node.getLeftChild());
			preOrderTraverse(node.getRightChild());
		}
	}
	
	private void inorder(BinaryTreeNode node) {
		if(node != null)
		{
			inorder(node.getLeftChild());
			System.out.print(node.getData() + " ");
			inorder(node.getRightChild());
		}
		else
			System.out.println("tree is Empty");
	}
	
	private void postorder(BinaryTreeNode node) {
		if(node != null)
		{
			postorder(node.getLeftChild());
			postorder(node.getRightChild());
			System.out.print(node.getData() + " ");
		}		
	}
	public int searchMaxElement(BinaryTreeNode rn)
	{
		int leftMax = 0;
		int rightMax = 0;
		int maxElement = 0;
		if(rn != null && rn.getLeftChild() != null)
		{
			leftMax = searchMaxElement(rn.getLeftChild());
		}
		if(rn != null && rn.getRightChild() != null)
		{
			
			rightMax = searchMaxElement(rn.getRightChild());
		}
		if(leftMax > rightMax)
			maxElement = leftMax;
		else
			maxElement = rightMax;
		if(rn.getData() > maxElement)
			maxElement = rn.getData();
		return maxElement;
	}
	
	public int searchMaxElementWithoutRec(BinaryTreeNode node)
	{
		int max = 0;
		Stack<BinaryTreeNode> q = new Stack<BinaryTreeNode>();
		
		if(node != null)
		{
			q.add(node);
			while(!q.isEmpty())
			{
				BinaryTreeNode tmp = q.pop();
				if(tmp.getData() > max)
				{
					max = tmp.getData();
				}
				if(tmp != null && tmp.getLeftChild() != null)
					q.add(tmp.getLeftChild());
				if(tmp != null && tmp.getRightChild() != null)
					q.add(tmp.getRightChild());
			}
			return max;
		}
		return max;		
	}
	
	public void searchElement(int i, BinaryTreeNode node) {
		
		if(node.getData() != i)
		{
			if(node != null)
			{
				if(node.getLeftChild()!= null)
				searchElement(i, node.left);
				if(node.getRightChild()!= null)
				searchElement(i, node.getRightChild());
			}
		}
		else
			System.out.println("Found the element : "+ i +" in tree" );		
	}
	
	public void printTreeInReverseLevelOrder(BinaryTreeNode node)
	{
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		
		if(node != null)
		{
			q.offer(node);
			while(!q.isEmpty())
			{
				BinaryTreeNode tmp = q.poll();
				if(tmp.getLeftChild() != null)
					q.add(tmp.getLeftChild());
				if(tmp.getRightChild() != null)
					q.add(tmp.getRightChild());
				
				s.push(tmp);
			}
		}
		while(!s.isEmpty())
		{
			System.out.print(s.pop().getData()+ "-");
		}
	}
	
	public int getHightRecurrsive(BinaryTreeNode node)
	{
		int leftHight = 0;
		int rightHight = 0;
		if (node != null)
		{
			if(node.left != null)
				leftHight = getHightRecurrsive(node.left);
			if(node.right != null)
				rightHight = getHightRecurrsive(node.right);
			
			return leftHight > rightHight ? leftHight + 1 : rightHight + 1;
		}
		return 0;
	}
	
	public int findMinimumDepth(BinaryTreeNode node)
	{
		int minDepth = 99999;
		BinaryTreeNode prev = null;
		Stack<BinaryTreeNode> s = new Stack<>();
		s.push(node);
		if(node != null)
		{
			while (!s.isEmpty())
			{
				BinaryTreeNode curr = s.peek();
				if(prev == null || prev.right == curr || prev.left == curr)
				{
					if(curr.left != null) s.push(curr.left);
					else if(curr.right != null) s.push(curr.right);
				}
				else if (curr.left == prev)
					{
						if(curr.right != null) s.push(curr.right);
					}
				else
					s.pop();
				
				prev = curr;
				
				if(curr.left == null && curr.right == null && s.size() < minDepth)
					minDepth = s.size();
			}
			
		}
			
		return minDepth;
	}
	
	public void preOrderWithoutRecc(BinaryTreeNode node) {
		
		Stack<BinaryTreeNode> s = new Stack<>();
		s.push(node);
		while(!s.isEmpty())
		{
			BinaryTreeNode tmp = s.pop();
			System.out.print(tmp.getData()+"-");
			if(tmp.right != null)
				s.push(tmp.right);
			if(tmp.left != null)
				s.push(tmp.left);
		}		
	}
	public void inOrderWORecc(BinaryTreeNode node) {
		
		Stack<BinaryTreeNode> s = new Stack<>();
		BinaryTreeNode curr = node;
		boolean done = false;
		while(!done)
		{
			if(curr != null)
			{
				s.push(curr);
					curr = curr.left;
			}
			else
				if(!s.isEmpty())
				{
					curr = s.pop();
					System.out.print(curr.getData() + "-");
						curr = curr.right;
				}
				else
				{
					done = false;
				}
		}
		
		
	}
}
