package structures;

public class Node {
	
	int data;
	public Node next;
	
	public Node(int info, Node node) {
		data = info;
		next = node;
	}
	public Node() {
		data = 0; //default num
		next = null;
	}
	
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
		//not included on hackerrank
	}
	public void setNext(Node node) {
		next = node;
	}
	public void print() {
		System.out.println(data);
	}

}
