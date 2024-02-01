package com.neosoft.linkedlist;

public class SLL {
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
	@Override
	public String toString() {
		if(head==null) {
			return "[]";
		}
		Node currNode=head;
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		while(currNode!=null) {
			sb.append(currNode.data);
			sb.append(", ");
			currNode =currNode.next;
		}
		sb.append("]");
		int start=sb.lastIndexOf(",");
		int end=start+2;
		sb.delete(start, end);
		return sb.toString();
	}
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(int data) {
		Node newNode=new Node(data);
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
	public void insert(int index,int data) {
		int i=0;
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		if(index!=0) {
			Node currNode=head;
			Node temp=null;
			while(currNode.next!=null && i<index) {
				temp=currNode;
				currNode=currNode.next;
				i++;
			}
			temp.next=newNode;
			newNode.next=currNode;
		}else {
			newNode.next=head;
			head =newNode;
		}
		
	}
	public void deleteFirst() {
		if(head==null) {
			System.out.println("SLL is empty");
			return;
		}
		size--;
		head=head.next;
	}
	public void deleteLast() {
		if(head==null) {
			System.out.println("SLL is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			size--;
			return;
		}
		Node tmp1=head;
		Node tmp2=head.next;
		while(tmp2.next!=null) {
			tmp1=tmp1.next;
			tmp2=tmp2.next;
		}
		size--;
		tmp1.next=null;
	}
	/*public void deleteElement(int val) {
		Node tmp=head;
		if(tmp==null) {
			System.out.println("SLL is Empty");
			
		}
		if(tmp.data==val) {
			tmp=tmp.next;
			size--;
			
		}
		while(tmp.next!=null ) {
			if(tmp.next.data==val) {
				tmp.next=tmp.next.next;
				size--;
				
			}
			tmp=tmp.next;
		}
	}
	*/
	
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
