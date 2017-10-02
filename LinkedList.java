public class LinkedList {
	Node node1;
	int size;
	
	public LinkedList() {
		node1 = new Node();
		size = 0;
	}
	
	// Test code - main function
	public static void main(String[] args) {
		LinkedList example = new LinkedList();
		System.out.println(example.getSize());
		example.add(1);
		System.out.println(example.getSize());
		example.add(2);
		example.add(3);
		example.add(4);
		example.add(5);
		example.add(6);
		example.add(7);
		System.out.println(example.addLayer(8));
		System.out.println(example.find(4).getData());
		example.remove(5);
		System.out.println(example.getSize());
		System.out.println(example.find(5));
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
	 for (int dataright = 1; int i <= 4; i++)
            System.out.println("Value of Node %: " );
		return newNode;
	}
	
	public Node addbottom(int databottom) {
		Node newNode = new Node(databottom, node1);
		this.node1 = newNode;
		 for (int dataright = 1; int i <= 4; i++)
            System.out.println("Value of Node %: " );
		return newNode;
	}
	
	
	public Node addLayer(int maxStep) {
		Node thisNode=this.node1;
		max=7;
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
	private class Node {
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
		
		private int getMaxData() {
			return this.data;
		}
		
		private void setData(int value) {
			this.data = value;
		}
		
		private int getData() {
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