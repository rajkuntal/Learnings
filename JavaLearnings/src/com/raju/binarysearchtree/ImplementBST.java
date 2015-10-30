package com.raju.binarysearchtree;

public class ImplementBST {
	
	BSTNode root;
	
	public ImplementBST() {
		root = null;
	}
	
	public void preorder(BSTNode node) {
		if(node != null)
		{
			System.out.print(node.data + " ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void preorder() {
		preorder(root);
	}
	
	public void inorder(BSTNode node) {
		if(node != null)
		{
			preorder(node.left);
			System.out.print(node.data + " ");
			preorder(node.right);
		}
	}
	
	public void inorder() {
		inorder(root);
	}
	
	public void postorder(BSTNode node) {
		if(node != null)
		{
			preorder(node.left);
			preorder(node.right);
			System.out.print(node.data + " ");
		}
	}
	
	public void postorder() {
		postorder(root);
	}
	
	public BSTNode insertNode(BSTNode node,int data) {
		if(node == null)
			node = new BSTNode(data);
		else
		{
			if(data < node.data)
				node.left = insertNode(node.left, data);
			else
				node.right = insertNode(node.right, data);					
		}
		
		return(node);		
	}
	
	public void insert(int data) {
		root = insertNode(this.root, data);
	}
	
	public boolean searchElement(BSTNode node, int data) {
		if(node != null)
		{
			if(node.data == data)
				return true;
			else if(node.data > data)
				return searchElement(node.left, data);
			else
				return searchElement(node.right, data);
		}
		else
			return false;
	}
	
	public void searchElement(int data) {
		if(searchElement(root, data))
			System.out.println("Element "+ data +" found");
		else
			System.out.println("Element "+ data +" not found");
	}
	
	public int size(BSTNode node) {
		int leftSize = 0;
		int rightSize = 0;
		if(node != null)
		{
			leftSize = leftSize + size(node.left);
			rightSize = rightSize + size(node.right);
			return (leftSize + 1 + rightSize);
		}
		else
			return 0;
	}
	
	public void size() {
		System.out.println("Tree Size : "+size(root));
	}
	
	public int maxDepth(BSTNode node) {
		if(node == null)
			return 0;
		else
		{
			int leftDepth = maxDepth(node.left);
			int rightDepth = maxDepth(node.right);
			
			return(Math.max(leftDepth, rightDepth) + 1);
		}
	}
	
	public void maxDepth() {
		System.out.println("Trees Max Depth is :" + maxDepth(root));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementBST obj = new ImplementBST();
		obj.insert(8);
		obj.insert(6);
		obj.insert(7);
		obj.insert(5);
		obj.insert(10);
		obj.insert(9);
		
		System.out.print("Pre-Order  : "); obj.preorder(); System.out.println();
		System.out.print("In-Order   : "); obj.inorder(); System.out.println();
		System.out.print("post-Order : "); obj.postorder(); System.out.println();
		
		obj.searchElement(6);
		obj.searchElement(11);
		obj.size();
		obj.maxDepth();
	}

}
