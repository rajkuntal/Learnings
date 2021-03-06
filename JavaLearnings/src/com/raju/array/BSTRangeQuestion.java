package com.raju.array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class BSTRangeQuestion {
	
	class BSTNode{
		int data;
		BSTNode left;
		BSTNode right;
		
		public BSTNode(int i) {
			// TODO Auto-generated constructor stub
			data = i;
			left = null;
			right = null;
		}
	};

	BSTNode root = null;
	
	public static void main(String[] args) {
		
		BSTRangeQuestion obj = new BSTRangeQuestion();
		/*obj.insertElement(56);
		obj.insertElement(28);
		obj.insertElement(89);
		obj.insertElement(12);
		obj.insertElement(20);
		obj.insertElement(86);
		obj.insertElement(18);
		obj.insertElement(95);
		obj.insertElement(60);
		obj.insertElement(50);
		obj.insertElement(25);*/
		//obj.insertElement(45);
		
		
		obj.doHere();
		System.out.println();
		//obj.findRange(40, 80);
		
	}
	
	public void doHere() {
		//InsertElementRecc(this.root, 45);
		int[] arr = {12,28,50,56,86,89,95};
		BSTNode node =  sortedArrToBST(arr, 0, arr.length-1);
		inOrder(node);
		System.out.println();
		preOrder(node);
		root = node;
		System.out.println();
		//findRange(40, 80);
		
		mirrorTree(root);
		preOrder(node);
		System.out.println();
		inOrder(node);
		System.out.println();
		System.out.println();
		int[] arr2 = new int[1000];
		printPaths(root, arr2, 0);
		System.out.println();
		printPaths2(root);
	}
	
	public void insertElement(int d) {
		if(this.root == null)
			this.root = new BSTNode(d);
		else{
			Queue<BSTNode> q = new LinkedList<>();
			q.add(this.root);
			while(!q.isEmpty()){
				BSTNode node = q.poll();
				if(node.data > d){
					if(node.left != null)
						q.add(node.left);
					else
						node.left = new BSTNode(d);
				}
				else{
					if(node.right != null)
						q.add(node.right);
					else
						node.right = new BSTNode(d);
				}
			}
		}					
	}
	
	public void InsertElementRecc(BSTNode root ,int d) {
		if(root.data > d){
			if(root.left == null)
				root.left = new BSTNode(d);
			else
				InsertElementRecc(root.left, d);
		}
		if(root.data < d){
			if(root.right == null)
				root.right = new BSTNode(d);
			else
				InsertElementRecc(root.right, d);
		}
			
	}
	
	public void inOrder(BSTNode root) {
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public void preOrder(BSTNode root) {
		if(root != null){
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void findRange(int min, int max) {
		Queue<BSTNode> q = new LinkedList<>();
		q.add(this.root);
		while(!q.isEmpty()){
			BSTNode node = q.poll();
			if(node.data >= min && node.left != null){
				q.add(node.left);
			}
			if(node.data <= max && node.right != null)
				q.add(node.right);
			
			if(node.data >= min && node.data <= max)
				System.out.print(node.data + " ");
		}
	}
	
	public BSTNode sortedArrToBST(int[] arr, int start, int end) {
		
		if(start > end)
			return null;
		
			int mid = start + ((end-start)/2);
			BSTNode root = new BSTNode(arr[mid]);
			root.left = sortedArrToBST(arr, start, mid-1);
			root.right = sortedArrToBST(arr, mid+1, end);
		
		return root;
		
	}
	
	public void mirrorTree(BSTNode root){
		if(root != null){
			BSTNode temp;
			temp = root.left;
			root.left = root.right;
			root.right = temp;
			mirrorTree(root.left);
			mirrorTree(root.right);
		}
	}
	
	public void printPaths(BSTNode node, int[] arr, int index){
		arr[index] = node.data;
		index++;
		if (node.left == null && node.right == null){
			printPath(arr, index);
			return;
		}	
		if (node.left != null)
			printPaths(node.left, arr, index);
		if (node.right != null)
			printPaths(node.right, arr, index);
	}

	private void printPath(int[] arr, int index) {
		for (int i =0; i< index; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void printPaths2(BSTNode root) {
		
		Stack<BSTNode> s = new Stack<>();
		Map<BSTNode, int[]> m = new HashMap<BSTNode, int[]>();
		int[] a= {0,0};
		
		if(root != null)
			s.push(root);
		while(!s.isEmpty()){
			BSTNode tmp = s.peek();
			if(tmp.left == null && tmp.right == null){
				Iterator<BSTNode> itr = s.iterator();
				while(itr.hasNext()){
					System.out.print(itr.next().data + " ");
				}
				s.pop();
				System.out.println();
			}
			tmp = s.peek();
			if(m.containsKey(tmp)){
				a = m.get(tmp);
				if(a[0] == 1 && a[1] == 1)
					s.pop();
			}
			tmp = s.peek();
			if(tmp.left != null || tmp.right != null){
				if(m.containsKey(tmp)){
					a = m.get(tmp);
					if(a[0] != 1 && tmp.left != null){
						a[0] = 1;
						s.push(tmp.left);
						m.put(tmp, a);
					}
					else if(a[1] != 1 && tmp.right != null){
						a[1] = 1;
						s.push(tmp.right);
						m.put(tmp, a);
					}
				}
				else
				{
					a[0] = 1;
					s.push(tmp.left);
					m.put(tmp, a);
				}
			}				
		}		
		
	}
}
