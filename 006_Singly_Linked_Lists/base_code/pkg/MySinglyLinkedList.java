package pkg;
import java.util.Scanner;
import java.util.Random;


public class MySinglyLinkedList {
	Node head;


	/* 
		Postcondition: The head will be null 
	*/
	public MySinglyLinkedList() {
			head = null;
	}

	/* 
		Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
	   	If the position doesn't exist, it returns -1
	*/ 
	public int get(int pos){
		Node current = head;
		for(int i = 0; i<pos; i++){
			current = current.getNext();
		}
		return current.getData();
	}

	/*
		Insert a new Node at the given position with the data given
	*/
	public void insert(int pos, int data){
		Node current = head;
		if(pos ==0){
			Node temp = new Node(data);
			temp.setNext(head);
			head = temp;
			return;
		}
		for(int i = 0; i<pos-1; i++){
			current = current.getNext();
			if (current == null){ 
				return;
			}
		}
		Node a = new Node(data);
		a.setNext(current.getNext());
		current.setNext(a);
	}

	/*
		Remove the node at the given position
		If no position exists, don't change the list
	*/
	public void remove(int pos){
		Node current = head;
		if (pos == 0) {
        	if (head != null) {
            	head = head.getNext();
        	}
        	return;
    	}
		for(int i = 0; i<pos-1; i++){
			if (current == null){ 
				return;
			}
			current = current.getNext();
		}
		if(current == null||current.getNext()==null){
			return;
		}
		Node b = current.getNext();
		b = b.getNext();
		current.setNext(b);
		
	}

	/*
		Print all data values in the LinkedList 
	*/
	public void printList(){
		Node current = head;
		while(current != null){
			System.out.print(current.getData()+" , ");
			current = current.getNext();
		}
	}
}
