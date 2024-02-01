package com.neosoft.linkedlist;

public class SLL {

	Node head;
	int count;
	
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
			this.next=null;
			count++;
		}
	}
	public void addFirst(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			return;
		}
			newNode.next=head;
			head=newNode;
		
	}
	public void addLast(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
		
	}
	public void print() {
		Node temp=head;
		if(head==null) {
			System.out.println(temp);
		return;
		}
			while(temp!=null) {
				System.out.print(temp.value+" ->");
				temp=temp.next;
			}
	}
}
