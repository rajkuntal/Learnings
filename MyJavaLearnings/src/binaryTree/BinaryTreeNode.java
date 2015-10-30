package binaryTree;

public class BinaryTreeNode {
	
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	public BinaryTreeNode(int d) {
	
		this.data = d;
		this.left = null;
		this.right = null;
	}
	
	public int getData(){
		return this.data;
	}
	
	public BinaryTreeNode getLeftChild() {
		return this.left;
	}
	
	public BinaryTreeNode getRightChild() {
		return this.right;
	}
	
	public void setLeftChild(BinaryTreeNode node) {
		this.left = node;
	}
	
	public void setRightChild(BinaryTreeNode node) {
		this.right = node;
	}
}
