package com.bridgelab.LinkedList.Day14;

public class LL {
	
	Node head; // Create a head
	
	// add First Element 
	
	public void addfirst(Integer data) { // function for Add First && Integer parametr pass
		
		Node newNode = new Node(data);  // create a new node
		
	// checking the head is null or not
		if(head==null) {
			head = newNode;
			return;
			
		}
		newNode.next = head;
		head = newNode;
		
		
	}
	// Add Last Element 
	 
	public void addLast(Integer data) { // Function for Add Last && Integer parametr pass
		
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
		    return;
			
		}
		// Treverse
		
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
			}
			currNode.next = newNode; // when we reach at last node that time we declare current node as a new node 
			}
	
	//Print LinkedList
	 public void printlist() {
		 if(head==null) {
			 System.out.println("This List Is Empty ");
			 return;
		 }
		 Node currNode = head;
			while (currNode != null) {
				System.out.println(currNode.data ); // Print the data of current node 
				currNode = currNode.next;
				}
				
		
		 }
	 
	 //Delete first
	 
	 public void deletefirst() {
		 if(head==null) {
			 System.out.println(" This List Is Empty");
			 return;
		 }
		 head = head.next;
	 }
		 
	 
	

	public static void main(String[] args) {
		
		LL list = new LL();
		list.addfirst(10);
		list.addLast(30);
		list.printlist();
		list.deletefirst();
		System.out.println("After delete first Element the LinkedList is:");
		list.printlist();
		

	}

}
