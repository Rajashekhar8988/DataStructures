package bridgeLabz.Development.LinkedList;


class UC1_LinkedList {

// create an object of Node class
	  Node head;

	  static class Node {
	    int value;
	    Node next;
// connect each node to next node
	    
	    Node(int d) {
	      value = d;
	      next = null;
	    }
	  }
	  public static void main(String[] args) {

		  UC1_LinkedList linkedList = new UC1_LinkedList();

// assign values to each linked list node
	    linkedList.head = new Node(56);
	    Node second = new Node(30);
	    Node third = new Node(70);

// connect each node of linked list to next node
	    linkedList.head.next = second;
	    second.next = third;
// printing node-value
	    System.out.print("LinkedList: ");
	    while (linkedList.head != null) {
	      System.out.print(linkedList.head.value + " ");
	      linkedList.head = linkedList.head.next;
	    }
	  }
	}

