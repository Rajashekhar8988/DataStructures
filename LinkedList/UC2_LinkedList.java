package bridgeLabz.Development.LinkedList;

import bridgeLabz.Development.DataStructures.DemoLinkedList.Node;

class PushData{
	
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
// Inserts a new Node at front of the list. 
public void push(int new_data)
{
// 1 & 2: Allocate the Node & Put in the data
    Node new_node = new Node(new_data);

// 3. Make next of new Node as head
    new_node.next = head;

// 4. Move the head to point to new Node
    head = new_node;
}
public void printList()
{
    Node tnode = head;
    while (tnode != null)
    {
        System.out.print(tnode.data+" ");
        tnode = tnode.next;
    }
}
}
public class UC2_LinkedList {

	public static void main(String[] args) {
		PushData p=new PushData();
		p.push(70);
		p.push(30);
		p.push(56);
		p.printList();
	}
}
