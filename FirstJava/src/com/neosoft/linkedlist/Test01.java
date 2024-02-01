package com.neosoft.linkedlist;

public class Test01 {

	public static void main(String[] args) {
		SLL sll=new SLL();
		sll.print();
		/*sll.addLast(10);
		sll.addLast(12);
		sll.addLast(13);
		sll.print();*/
		sll.addFirst(10);
		sll.addFirst(12);
		sll.addFirst(13);
		sll.print();
	}
}
