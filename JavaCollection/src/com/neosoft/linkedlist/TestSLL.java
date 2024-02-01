package com.neosoft.linkedlist;

public class TestSLL {
	public static void main(String[] args) {
		SLL sll=new SLL();
		System.out.println(sll);
		sll.addFirst(1);
		sll.addFirst(2);
		sll.addFirst(3);
		System.out.println(sll);
		sll.addLast(11);
		sll.addLast(12);
		System.out.println(sll);
		sll.insert(3, 10);
		System.out.println(sll);
		
		sll.deleteFirst();
		System.out.println(sll);
		sll.deleteLast();
		System.out.println(sll);
		
		sll.reverse();
		System.out.println(sll);
		
		
		
	}

}
