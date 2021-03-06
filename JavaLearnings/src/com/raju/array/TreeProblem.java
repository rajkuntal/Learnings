package com.raju.array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TreeProblem {

	TreeNode rootNode;
	
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int i) {
			// TODO Auto-generated constructor stub
			data = i;
			left = null;
			right = null;
		}
	};
	
	public static void main(String[] args) {
		
		//Scanner s = new Scanner(System.in);
		int count = 9;//Integer.parseInt(s.next());
		
		//s.nextLine();
		String elements = "8 0 7 7 5 8 5 0 -1";//s.nextLine();
		String[] arr = elements.split(" ");
		
		ArrayList<Integer> ll;
		Map<Integer, ArrayList<Integer>> m = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			int v = Integer.parseInt(arr[i]);
			if(!m.containsKey(v))
			{
				ll = new ArrayList<>();
				ll.add(i);
				m.put(v, ll);
			}
			else
			{
				ll = m.get(v);
				ll.add(i);
				m.put(v, ll);
			}			
		}
		TreeProblem obj = new TreeProblem();
		obj.constructTree(m);
	}
	
	public ArrayList<Integer> findElement(int[] arr, int v){
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == v)
				al.add(i);
		return al;
	}
	
	public void constructTree(Map<Integer, ArrayList<Integer>> m){
		
		TreeNode node1;
		TreeNode node2;
		
		ArrayList<Integer> al = m.get(-1);
		this.rootNode = new TreeNode(al.get(0));
		
		Stack<TreeNode> s = new Stack<>();
		Queue<TreeNode> q = new LinkedList<>();
		s.push(rootNode);
		while(!s.isEmpty()){
			TreeNode node = s.pop();
			al = m.get(node.data);
			if(al != null && al.size() == 1)
			{
				node1 = new TreeNode(al.get(0));
				node.left = node1;
				s.push(node1);
			}
			if(al != null && al.size() == 2)
			{
				node1 = new TreeNode(al.get(0));
				node.left = node1;
				s.push(node1);
				
				node2 = new TreeNode(al.get(1));
				node.right = node2;
				s.push(node2);
			}
		}
		
		q.add(rootNode);
		int c = 1;
		Stack<Integer> s1 = new Stack<>();
		s1.push(rootNode.data);
		s1.push(99999);
		while(!q.isEmpty()){
			TreeNode node = q.poll();
			c--;
			System.out.print(node.data + " ");
			al = m.get(node.data);
			if(al != null && al.size() == 1)
			{
				node1 = new TreeNode(al.get(0));
				node.left = node1;
				q.add(node1);
				s1.push(node1.data);
			}
			if(al != null && al.size() == 2)
			{
				node2 = new TreeNode(al.get(1));
				node.right = node2;
				q.add(node2);
				s1.push(node2.data);
				
				node1 = new TreeNode(al.get(0));
				node.left = node1;
				q.add(node1);
				s1.push(node1.data);
			}
			if(c == 0){
				c = q.size();
				if(c > 0)
					s1.push(99999);
				System.out.println();
			}
		}
		System.out.println();
		int v = s1.pop();
		int size = s1.size();
		for(int i = 0; i < size; i++){
			v = s1.pop();
			if(v == 99999)
				System.out.println();
			else
				System.out.print(v + " ");
		}
		System.out.println();
		System.out.print("Inorder :");  inOrder(rootNode);
		System.out.println();
		System.out.print("PreOrder :");  preOrder(rootNode);
		System.out.println();
		System.out.print("PostOrder :");  postOrder(rootNode);
		System.out.println();
		levelOrder(rootNode);
	}
	
	public void inOrder(TreeNode root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public void preOrder(TreeNode root){
		if(root != null){
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void postOrder(TreeNode root){
		if(root != null){			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public void levelOrder(TreeNode root ) {
		int i = 1;
		String s ="";
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		q2.add(root);
		System.out.println();
		System.out.print("Reverse Level Order - BFS");
		levelRec(i, q2);
		q2.add(root);
		System.out.println();
		System.out.print("Level Order - BFS");
		System.out.println();
			while(!q2.isEmpty()){			
			if(i>0)
				i--;
			TreeNode n = q2.poll();
			if(n.left != null)
				q2.add(n.left);
			if(n.right != null)
				q2.add(n.right);
			System.out.print(n.data + " ");
			
			if(i == 0)
			{
				i = q2.size();
				System.out.println();
			}
		}
		String[] a = s.split(":");
		for(int j = a.length -1; j >= 0; j--)
			System.out.println(a[j]);
		
	}

	
	public void levelRec(int i, Queue<TreeNode> q2) {
		boolean newLine = false;
		if(!q2.isEmpty()){		
			
			if(i>0)
				i--;
			TreeNode n = q2.poll();
			if(n.left != null)
				q2.add(n.left);
			if(n.right != null)
				q2.add(n.right);			
			if(i == 0)
			{
				i = q2.size();
				newLine = true;
				//System.out.println();
			}
			levelRec(i, q2);
			if(newLine)
			{
				System.out.println();
			}
			System.out.print(n.data + " ");
			
		}
	}
}


