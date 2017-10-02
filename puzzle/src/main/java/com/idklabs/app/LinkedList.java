package com.idklabs.app;

public class LinkedList {
	Node node1;
	int size;
	int max = 7;
	
	public LinkedList() {
		node1 = new Node();
		size = 1;
	}
	
	public void setSize(int s) {
		this.size = s;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Node add(int data) {
		Node newNode = new Node(data, node1);
		this.node1 = newNode;
		this.size++;
		return newNode;
	}
	
	public Node addright(int dataright) {
		Node newNode = new Node(dataright, node1);
		this.node1 = newNode;
		return newNode;
	}
	
	public Node addbottom(int databottom) {
		Node newNode = new Node(databottom, node1);
		this.node1 = newNode;
		return newNode;
	}
	
	
	public Node addLayer() {
		Node thisNode=this.node1;
		if (thisNode.getData() > max)
			return thisNode;
			
		thisNode = thisNode.getNextNode();
		return null;
	}
	
	public Node find(int data) {
		Node thisNode = this.node1;
		
		while (thisNode != null) {
			if (thisNode.getData() == data)
				return thisNode;
			thisNode = thisNode.getNextNode();
		}
		return null;
	}
	
	public boolean remove(int data) {
		Node thisNode = this.node1;
		Node prevNode = null;
		
		while (thisNode != null) {
			if (thisNode.getData() == data) {
				if (prevNode != null)
					prevNode.setNextNode(thisNode.getNextNode());
				else
					this.node1 = null;
				this.setSize(this.getSize()-1);
				return true;
			}
			prevNode = thisNode;
			thisNode = thisNode.getNextNode();
		}
		return false;
	}
	
	// Node class
	public static class Node {
		private Node nextNode;
		private Node allNodes;
		private int data;
		private int max;

		// 0-arg constructor, 1-arg constructor, 2-arg constructor , 3 arg constructor
		private Node() { }
		
		public int addLayer(int max) {
			data=max;
			return this.data;
		}

		private Node(int value) {
			data = value;
		}
		
		private Node(int value, Node next) {
			data = value;
			nextNode = next;
		}
		
		private Node(int value, Node next, Node allNodes){
			data=value;
			nextNode= next;
			allNodes = next;
			
		}
		
		private void setMaxData(int max) {
			this.data = max;
		}
		
		public int getMaxData() {
			return this.data;
		}
		
		private void setData(int value) {
			this.data = value;
		}
		
		public int getData() {
			return this.data;
		}
		
		private void setNextNode(Node n) {
			this.nextNode = n;
		}
		
		private Node getNextNode() {
			return this.nextNode;
		}
		
		private void setallNodes(Node a) {
			this.allNodes = a;
		}
		
		private Node getallNodes() {
			return this.allNodes;
		}
	}		
		
}