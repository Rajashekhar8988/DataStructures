package bridgeLabz.Development.LinkedList;

class InsertAfter{
	
	// head of list
		Node head;  

	// Linked list Node
	class Node
	{
	    int data;
	    Node next;
	    Node(int d)
	    {
	    	data = d; 
	    	next = null;
	    	}
	}
	public void push(int new_data)
	{
// 1 & 2: Allocate the Node & Put in the data
	    Node new_node = new Node(new_data);

// 3. Make next of new Node as head
	    new_node.next = head;

// 4. Move the head to point to new Node
	    head = new_node;
	}
	
// Inserts a new Node at front of the list. 
	
	public void insertAfter(Node prev_node, int new_data)
    {
// 1. Check if the given Node is null 
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
// 2 & 3: Allocate the Node & Put in the data
        Node new_node = new Node(new_data);
 
//4. Make next of new Node as next of prev_node 
        new_node.next = prev_node.next;
 
//5. make next of prev_node as new_node
        prev_node.next = new_node;
    }
    
	public void printList()
	{
		System.out.print("LinkedList : ");
	    Node tnode = head;
	    while (tnode != null)
	    {
	        System.out.print(tnode.data+" ");
	        tnode = tnode.next;
	    }
	}
	}
public class UC4_LinkedList {
      public static void main(String[] args) {
    	  InsertAfter i=new InsertAfter();
	  i.push(70);
	  i.push(56);
	  i.insertAfter(i.head,30);
	  i.printList();
}
	
}