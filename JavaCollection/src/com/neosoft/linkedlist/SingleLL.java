package com.neosoft.linkedlist;

public class SingleLL {
	int size;
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	public void addFirst(int val) {
		Node node=new Node(val);
		if(head==null) {
			head=node;
			return;
		}
		node.next=head;
		head=node;
	}
	public void addLast(int val) {
		Node node=new Node(val);
		if(head==null) {
			head=node;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=node;
	}
	public String toString() {
		if(head==null)
			return "[]";
		Node currentNode=head;
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		while(currentNode!=null) {
			sb.append(currentNode.data);
			sb.append(", ");
			currentNode=currentNode.next;
		}
		sb.append("]");
		int start=sb.lastIndexOf(",");
		int end=start+2;
		sb.delete(start, end);
		
		return sb.toString();
	}
	public void reverse() {
		Node currNode=head;
		Node preNode=null;
		Node nextNode=null;
		while(currNode!=null) {
			nextNode=currNode.next;
			currNode.next=preNode;
			preNode=currNode;
			currNode=nextNode;
		}
		head=preNode;
	}

}
