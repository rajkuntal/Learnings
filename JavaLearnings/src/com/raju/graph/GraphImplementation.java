package com.raju.graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphImplementation {

	public static void main(String[] args) {
		GraphNode n1 = new GraphNode(1);
		GraphNode n2 = new GraphNode(2);
		GraphNode n3 = new GraphNode(3);
		GraphNode n4 = new GraphNode(4);
		GraphNode n5 = new GraphNode(5);
		
		GraphNode[] n1n = {n2,n3};
		GraphNode[] n2n = {n3,n1};
		GraphNode[] n3n = {n4,n5};
		GraphNode[] n4n = {n5};
		
		n1.SetNeibhours(n1n);
		n2.SetNeibhours(n2n);
		n3.SetNeibhours(n3n);
		n4.SetNeibhours(n4n);
		
		GraphImplementation obj1 = new GraphImplementation();
		
		//obj1.bfs(n1);
		System.out.println();
		obj1.allPaths(n2, n5, 0);
	}
	
	public void bfs(GraphNode n) {
		
		Queue<GraphNode> q = new LinkedList<>();
		q.add(n);
		n.visited = true;
		while(!q.isEmpty()){
			GraphNode nd = q.poll();
			System.out.print(nd + "   ");
			if(nd.neibhours != null){
				for(GraphNode gn : nd.neibhours){
					if(!gn.visited){
						q.add(gn);
						gn.visited = true;
					}
				}
			}
		}
	}
	
	public void dfs() {
		
	}
	
	public void shortestPath() {
		
	}
	
	GraphNode[] aa = new GraphNode[100];
	
	public void allPaths(GraphNode n1, GraphNode n2, int index) {
		if(n1 == null || n2 == null)
			return;
		aa[index] = n1;
		n1.visited = true;
		index++;
		if(n1 == n2){
			for(int i = 0; i < index; i++)
				System.out.print(aa[i] + "  ");
			System.out.println();
			n1.visited = false;
			return;
		}
		if(n1.neibhours != null){
			GraphNode[] nbr = n1.neibhours;
			for(int i = 0; i < nbr.length; i++){
				if(!nbr[i].visited)
				allPaths(nbr[i], n2, index);
			}
		}
		n1.visited = false;
	}
}
