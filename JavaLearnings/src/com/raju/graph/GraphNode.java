package com.raju.graph;

public class GraphNode {
	int data;
	GraphNode neibhours[];
	boolean visited;
	
	public GraphNode(int d) {
		// TODO Auto-generated constructor stub
		this.data = d;
	}
	
	public void SetNeibhours(GraphNode[] nbrs) {
		// TODO Auto-generated constructor stub
		this.neibhours = nbrs;
	}
	
	public GraphNode(int d, GraphNode[] nbrs) {
		// TODO Auto-generated constructor stub
		this.data = d;
		this.neibhours = nbrs;
	}
	
	public String toString() {
		return("Node Data :" + this.data);
	}
}
