package structures;

public class Node {
	
	int data;
	Node next;
	
	public Node(int info, Node node) {
		data = info;
		next = node;
	}
	public Node() {
		data = 0; //default num
		next = null;
	}
	public int getKey() {
		return data%1000;
	}

}