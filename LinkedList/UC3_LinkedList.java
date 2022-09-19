package bridgeLabz.Development.LinkedList;

import bridgeLabz.Development.LinkedList.PushData.Node;

class AppendData{
	
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
	public void append(int new_data)
    {
/* 1. Allocate the Node &
   2. Put in the data
   3. Set next as null */
        Node new_node = new Node(new_data);
 
// 4. If the Linked List is empty, then make the new node as head */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
 
// 5. This new node is going to be the last node, so make next of it as null 
        new_node.next = null;
 
        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;
 
// 6. Change the next of last node */
        last.next = new_node;
        return;
    }
	public void printList()
	{
		System.out.print("LinkedList: ");
	    Node tnode = head;
	    while (tnode != null)
	    {
	        System.out.print(tnode.data+" ");
	        tnode = tnode.next;
	    }
	}
	}
public class UC3_LinkedList {
      public static void main(String[] args) {
	  AppendData a=new AppendData();
	  a.push(56);
	  a.append(30);
	  a.append(70);
	  a.printList();
}
	
}
