package hackerrank.Java;

import java.util.ArrayList;

import structures.Node;

public class HasCycle {
	
	/*
	  Detect cycle in the list
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	int hasCycle(Node head) {
	    if (head == null || head.next == null) {
	        return 0;
	    } else {
	        Node a;
	        ArrayList<Node> nodeList = new ArrayList<Node>();
	        a = head;
	        while (a.next != null) {
	            for (int i = 0; i < nodeList.size(); i++) {
	                if (a == nodeList.get(i)) {
	                    return 1;
	                }
	            }
	            nodeList.add(a);
	            a = a.next;
	        }
	    }
	    return 0;
	}

}
