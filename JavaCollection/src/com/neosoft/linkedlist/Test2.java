package com.neosoft.linkedlist;

public class Test2 {

	public static void main(String[] args) {
		SingleLL ll=new SingleLL();
		System.out.println(ll);
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addLast(4);
		ll.addLast(5);
		System.out.println(ll);
		ll.reverse();
		System.out.println(ll);
	}
}
